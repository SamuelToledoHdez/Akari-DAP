package com.comp301.a09akari;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.comp301.a09akari.controller.*;
import com.comp301.a09akari.model.*;
import com.comp301.a09akari.view.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SamplePuzzlesTest {

    @Test
    public void testPuzzle01() {
        // Verifica que la matriz PUZZLE_01 no sea nula y tenga las dimensiones esperadas
        assertNotNull(SamplePuzzles.PUZZLE_01);
        assertEquals(7, SamplePuzzles.PUZZLE_01.length);
        assertEquals(7, SamplePuzzles.PUZZLE_01[0].length);

    }

    @Test
    public void testPuzzle02() {
        // Verifica que la matriz PUZZLE_02 no sea nula y tenga las dimensiones esperadas
        assertNotNull(SamplePuzzles.PUZZLE_02);
        assertEquals(10, SamplePuzzles.PUZZLE_02.length);
        assertEquals(10, SamplePuzzles.PUZZLE_02[0].length);


    }

    @Test
    public void testPuzzle03() {
        // Verifica que la matriz PUZZLE_02 no sea nula y tenga las dimensiones esperadas
        assertNotNull(SamplePuzzles.PUZZLE_03);
        assertEquals(7, SamplePuzzles.PUZZLE_03.length);
        assertEquals(7, SamplePuzzles.PUZZLE_03[0].length);

    }

        @Test
    public void testPuzzle04() {
        // Verifica que la matriz PUZZLE_02 no sea nula y tenga las dimensiones esperadas
        assertNotNull(SamplePuzzles.PUZZLE_04);
        assertEquals(10, SamplePuzzles.PUZZLE_04.length);
        assertEquals(10, SamplePuzzles.PUZZLE_04[0].length);

    }

        @Test
    public void testPuzzle05() {
        // Verifica que la matriz PUZZLE_02 no sea nula y tenga las dimensiones esperadas
        assertNotNull(SamplePuzzles.PUZZLE_05);
        assertEquals(7, SamplePuzzles.PUZZLE_05.length);
        assertEquals(6, SamplePuzzles.PUZZLE_05[0].length);

    }

        @Test
    public void testPuzzle06() {
        // Verifica que la matriz PUZZLE_02 no sea nula y tenga las dimensiones esperadas
        assertNotNull(SamplePuzzles.PUZZLE_06);
        assertEquals(8, SamplePuzzles.PUZZLE_06.length);
        assertEquals(8, SamplePuzzles.PUZZLE_06[0].length);

    }

        @Test
    public void testPuzzle07() {
        // Verifica que la matriz PUZZLE_02 no sea nula y tenga las dimensiones esperadas
        assertNotNull(SamplePuzzles.PUZZLE_07);
        assertEquals(10, SamplePuzzles.PUZZLE_07.length);
        assertEquals(10, SamplePuzzles.PUZZLE_07[0].length);

    }

        @Test
    public void testPuzzle08() {
        // Verifica que la matriz PUZZLE_02 no sea nula y tenga las dimensiones esperadas
        assertNotNull(SamplePuzzles.PUZZLE_08);
        assertEquals(10, SamplePuzzles.PUZZLE_08.length);
        assertEquals(10, SamplePuzzles.PUZZLE_08[0].length);

    }

        @Test
    public void testPuzzleExperto() {
        // Verifica que la matriz PUZZLE_02 no sea nula y tenga las dimensiones esperadas
        assertNotNull(SamplePuzzles.PUZZLE_EXPERTO);
        assertEquals(10, SamplePuzzles.PUZZLE_EXPERTO.length);
        assertEquals(10, SamplePuzzles.PUZZLE_EXPERTO[0].length);

    }

        @Test
    public void testPuzzleExpertoReal() {
        // Verifica que la matriz PUZZLE_02 no sea nula y tenga las dimensiones esperadas
        assertNotNull(SamplePuzzles.PUZZLE_EXPERTO_REAL);
        assertEquals(14, SamplePuzzles.PUZZLE_EXPERTO_REAL.length);
        assertEquals(14, SamplePuzzles.PUZZLE_EXPERTO_REAL[0].length);

    }



}