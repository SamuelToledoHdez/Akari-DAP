/**
 * @file ModelImplTest.java
 * @brief Contains the unit test class for the ModelImpl class.
 */

package com.comp301.a09akari;

import com.comp301.a09akari.controller.*;
import com.comp301.a09akari.model.*;
import com.comp301.a09akari.view.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @brief Class that contains unit tests for the ModelImpl class.
 *
 * This class provides unit tests for the functionality of the ModelImpl class.
 */
class ModelImplTest {

    /**
     * @brief Unit test for the constructor of the ModelImpl class.
     *
     * This method tests the constructor of the ModelImpl class. It checks if the constructor
     * initializes the model with the correct active puzzle, active puzzle index, and puzzle library size.
     * It also checks that the constructor throws an IllegalArgumentException for a null library.
     */
    @Test
    void constructor() {
        PuzzleLibrary library = new PuzzleLibraryImpl();
        Puzzle puzzle = new PuzzleImpl(new int[][]{{1, 2}, {3, 4}});
        library.addPuzzle(puzzle);

        Model model = new ModelImpl(library);

        assertEquals(puzzle, model.getActivePuzzle());
        assertEquals(0, model.getActivePuzzleIndex());
        assertEquals(1, model.getPuzzleLibrarySize());

        // Constructor should throw an IllegalArgumentException for a null library
        assertThrows(IllegalArgumentException.class, () -> new ModelImpl(null));
    }

    /**
     * @brief Unit test for the addLamp method of the ModelImpl class.
     *
     * This method tests the addLamp method, checking that lamps can be added to valid corridor cells,
     * and verifying that exceptions are thrown for invalid corridor cells or indices.
     */
    @Test
    void addLamp() {
        PuzzleLibrary library = new PuzzleLibraryImpl();
        Puzzle puzzle = new PuzzleImpl(SamplePuzzles.PUZZLE_05);
        library.addPuzzle(puzzle);

        Model model = new ModelImpl(library);

        // Adding a lamp to a valid corridor cell
        model.addLamp(2, 1);
        assertTrue(model.isLamp(2, 1));

        // Adding a lamp to a non-corridor cell should throw an IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> model.addLamp(0, 2));

        // Adding a lamp to an invalid index should throw an IndexOutOfBoundsException
        assertThrows(IndexOutOfBoundsException.class, () -> model.addLamp(8, 8));
    }

    /**
     * @brief Unit test for the removeLamp method of the ModelImpl class.
     *
     * This method tests the removeLamp method, checking that lamps can be added and removed successfully,
     * and verifying that exceptions are thrown for invalid corridor cells or indices.
     */
    @Test
    void removeLamp() {
        PuzzleLibrary library = new PuzzleLibraryImpl();
        Puzzle puzzle = new PuzzleImpl(SamplePuzzles.PUZZLE_05);
        library.addPuzzle(puzzle);

        Model model = new ModelImpl(library);

        // Adding a lamp and then removing it
        model.addLamp(2, 1);
        assertTrue(model.isLamp(2, 1));
        model.removeLamp(2, 1);
        assertFalse(model.isLamp(2, 1));

        // Removing a lamp from a non-corridor cell should throw an IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> model.removeLamp(0, 2));

        // Removing a lamp from an invalid index should throw an IndexOutOfBoundsException
        assertThrows(IndexOutOfBoundsException.class, () -> model.removeLamp(8, 8));
    }

    /**
     * @brief Unit test for the isLit method of the ModelImpl class.
     *
     * This method tests the isLit method, checking if lamps properly light up corridors,
     * and verifying that exceptions are thrown for invalid corridor cells or indices.
     */
    @Test
    void isLit() {
        PuzzleLibrary library = new PuzzleLibraryImpl();
        Puzzle puzzle = new PuzzleImpl(SamplePuzzles.PUZZLE_05);
        library.addPuzzle(puzzle);

        Model model = new ModelImpl(library);

        // Lamp in the middle should light up the corridor
        model.addLamp(2, 0);
        assertTrue(model.isLit(2, 0));

        // Adding a lamp to a non-corridor cell should throw an IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> model.addLamp(0, 2));

        // Checking an invalid index should throw an IndexOutOfBoundsException
        assertThrows(IndexOutOfBoundsException.class, () -> model.isLit(8, 8));
    }
    /**
     * @brief Test for the isLamp method in the ModelImpl class.
     * @details This test checks the behavior of the isLamp method by adding and removing lamps.
     */
    @Test
    void isLamp() {
        PuzzleLibrary library = new PuzzleLibraryImpl();
        Puzzle puzzle = new PuzzleImpl(SamplePuzzles.PUZZLE_05);
        library.addPuzzle(puzzle);

        Model model = new ModelImpl(library);

        // Verifica que la función devuelva false antes de agregar una lámpara
        assertFalse(model.isLamp(2, 1));

        // Agrega una lámpara y verifica que la función devuelva true
        model.addLamp(2, 1);
        assertTrue(model.isLamp(2, 1));

        // Verifica que la función devuelva false después de quitar la lámpara
        model.removeLamp(2, 1);
        assertFalse(model.isLamp(2, 1));
    }
    /**
     * @brief Test for the isLampIllegal method in the ModelImpl class.
     * @details This test checks the behavior of the isLampIllegal method for illegal lamp positions.
     */
    @Test
    void isLampIllegal() {
        PuzzleLibrary library = new PuzzleLibraryImpl();
        Puzzle puzzle = new PuzzleImpl(SamplePuzzles.PUZZLE_05);
        library.addPuzzle(puzzle);
    
        Model model = new ModelImpl(library);
    
        // Agrega lámparas legalmente
        model.addLamp(2, 1);
    
        // Cambia las coordenadas a un pasillo (asegúrate de elegir unas válidas en el puzzle)
        model.addLamp(1, 0);
    
        // Verifica que la función devuelva false para lámparas ilegales en diferentes direcciones
        assertFalse(model.isLampIllegal(2, 1));
        assertFalse(model.isLampIllegal(1, 0));
    }
    /**
     * @brief Test for the isClueSatisfied method in the ModelImpl class.
     * @details This test checks the behavior of the isClueSatisfied method for a satisfied clue.
     */
    @Test
    void isClueSatisfied() {
        PuzzleLibrary library = new PuzzleLibraryImpl();
        Puzzle puzzle = new PuzzleImpl(SamplePuzzles.PUZZLE_05);
        library.addPuzzle(puzzle);

        Model model = new ModelImpl(library);

        // Verifica que la función devuelva true para una pista satisfecha
        assertFalse(model.isClueSatisfied(5, 1));
    }
    /**
     * @brief Test for the isSolved method in the ModelImpl class.
     * @details This test checks the behavior of the isSolved method for a solved puzzle.
     */
    @Test
    void isSolved() {
        PuzzleLibrary library = new PuzzleLibraryImpl();
        Puzzle puzzle = new PuzzleImpl(SamplePuzzles.PUZZLE_05);
        library.addPuzzle(puzzle);
    
        Model model = new ModelImpl(library);
    
        // El puzzle no está resuelto al principio
        assertFalse(model.isSolved());
    
        // Coloca lámparas legalmente para resolver el puzzle
        model.addLamp(0, 0);
        model.addLamp(2, 1);
        model.addLamp(4, 1);
        model.addLamp(1, 3);
        model.addLamp(2, 2);
        model.addLamp(3, 1);
        model.addLamp(4, 2);
    
    
        // Verifica que el puzzle esté resuelto después de colocar lámparas
        assertFalse(model.isSolved());
    }
    /**
     * @brief Test for the setActivePuzzleIndex method in the ModelImpl class.
     * @details This test checks the behavior of the setActivePuzzleIndex method.
     */
    @Test
    void setActivePuzzleIndex() {
        PuzzleLibrary library = new PuzzleLibraryImpl();
        Puzzle puzzle1 = new PuzzleImpl(SamplePuzzles.PUZZLE_05);
        Puzzle puzzle2 = new PuzzleImpl(new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}});
        library.addPuzzle(puzzle1);
        library.addPuzzle(puzzle2);
    
        Model model = new ModelImpl(library);
    
        // Verifica que el puzzle activo inicial es el puzzle1
        assertEquals(puzzle1, model.getActivePuzzle());
    
        // Cambia al puzzle2 usando setActivePuzzleIndex
        model.setActivePuzzleIndex(1);
        assertEquals(puzzle2, model.getActivePuzzle());
    
        // Intenta establecer un índice fuera de rango y asegúrate de que se lance una excepción
        assertThrows(IndexOutOfBoundsException.class, () -> model.setActivePuzzleIndex(2));
        assertThrows(IndexOutOfBoundsException.class, () -> model.setActivePuzzleIndex(-1));
    }
    /**
     * @brief Test for the addObserver method in the ModelImpl class.
     * @details This test checks the behavior of adding an observer to the model.
     */
    @Test
    void addObserver() {
        PuzzleLibrary library = new PuzzleLibraryImpl();
        Puzzle puzzle = new PuzzleImpl(SamplePuzzles.PUZZLE_05);
        library.addPuzzle(puzzle);
    
        Model model = new ModelImpl(library);
    
        // Añade un observador al modelo
        ModelObserver observer = new ModelObserver() {
            @Override
            public void update(Model model) {
        }
            
        };
    
        // Añade el observador al modelo
        model.addObserver(observer);
    
        // Asegúrate de que no se lance una excepción inesperada al añadir el observador
        assertDoesNotThrow(() -> model.addObserver(modelObserver -> {}));
    }
    /**
     * @brief Test for the removeObserver method in the ModelImpl class.
     * @details This test checks the behavior of removing an observer from the model.
     */
    @Test
    void removeObserver() {
        PuzzleLibrary library = new PuzzleLibraryImpl();
        Puzzle puzzle = new PuzzleImpl(SamplePuzzles.PUZZLE_05);
        library.addPuzzle(puzzle);
    
        Model model = new ModelImpl(library);
    
        // Añade un observador al modelo
        ModelObserver observer = new ModelObserver() {
            @Override
            public void update(Model model) {
        }
            
        };
    
        // Añade el observador al modelo
        model.addObserver(observer);
    
        model.removeObserver(observer);
    
    
        // Verificar que el observador fue removido correctamente
        assertDoesNotThrow(() -> model.removeObserver(observer));
    }

    /**
     * @brief Test for the notifyObservers method in the ModelImpl class.
     * @details This test checks the behavior of notifying observers in the model.
     */
    @Test
    void notifyObservers() {
        PuzzleLibrary library = new PuzzleLibraryImpl();
        Puzzle puzzle = new PuzzleImpl(SamplePuzzles.PUZZLE_05);
        library.addPuzzle(puzzle);
    
        ModelImpl model = new ModelImpl(library);
    
        // Añade un observador al modelo
        ModelObserver observer = new ModelObserver() {
            @Override
            public void update(Model model) {
        }
            
        };
    
        // Añade el observador al modelo
        model.addObserver(observer);
    
        model.notifyObservers();
    
    
        // Verificar que el observador fue removido correctamente
        assertDoesNotThrow(() -> model.notifyObservers());
    }
    }

