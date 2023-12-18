package com.comp301.a09akari;
import com.comp301.a09akari.model.*;
import org.junit.jupiter.api.Test;


import com.comp301.a09akari.controller.*;
import com.comp301.a09akari.view.*;
import static org.junit.jupiter.api.Assertions.*;



class ModelTest {

    @Test
    void testAddLamp() {
        // Crear una implementación de Model para las pruebas
        PuzzleLibrary library = new PuzzleLibraryImpl();
        Puzzle puzzle = new PuzzleImpl(SamplePuzzles.PUZZLE_05);
        library.addPuzzle(puzzle);

        Model model = new ModelImpl(library);

        // Añadir una lámpara a una celda válida
        model.addLamp(0, 0);

        // Verificar que la lámpara se haya añadido correctamente
        assertTrue(model.isLamp(0, 0));
    }

    @Test
    void testRemoveLamp() {
        // Crear una implementación de Model para las pruebas
        PuzzleLibrary library = new PuzzleLibraryImpl();
        Puzzle puzzle = new PuzzleImpl(SamplePuzzles.PUZZLE_05);
        library.addPuzzle(puzzle);

        Model model = new ModelImpl(library);

        // Añadir y luego quitar una lámpara
        model.addLamp(2, 1);
        assertTrue(model.isLamp(2, 1));

        model.removeLamp(2, 1);
        assertFalse(model.isLamp(2, 1));
    }

    @Test
    void testIsLit() {
        // Crear una implementación de Model para las pruebas
        PuzzleLibrary library = new PuzzleLibraryImpl();
        Puzzle puzzle = new PuzzleImpl(SamplePuzzles.PUZZLE_05);
        library.addPuzzle(puzzle);

        Model model = new ModelImpl(library);

        // Añadir lámparas para iluminar una celda
        model.addLamp(0, 0);
        model.addLamp(1, 0);
        assertTrue(model.isLit(0, 0));
        assertTrue(model.isLit(1, 0));
    }

    @Test
    void testIsLampIllegal() {
        // Crear una implementación de Model para las pruebas
        PuzzleLibrary library = new PuzzleLibraryImpl();
        Puzzle puzzle = new PuzzleImpl(SamplePuzzles.PUZZLE_05);
        library.addPuzzle(puzzle);

        Model model = new ModelImpl(library);

        // Añadir lámparas y verificar si están ilegalmente colocadas
        model.addLamp(0, 0);
        model.addLamp(1, 0);
        assertTrue(model.isLampIllegal(1, 0));
    }

    // Agregar más pruebas para los demás métodos de la interfaz Model

}
