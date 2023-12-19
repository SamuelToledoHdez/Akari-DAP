/**
 * @file SamplePuzzlesTest.java
 * @brief This file contains unit tests for the SamplePuzzles class.
 */
package com.comp301.a09akari;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.comp301.a09akari.controller.*;
import com.comp301.a09akari.model.*;
import com.comp301.a09akari.view.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * @brief This class contains unit tests for the SamplePuzzles class.
 */
public class SamplePuzzlesTest {
    /**
     * @brief Test for the PUZZLE_01 matrix in SamplePuzzles.
     * @details This test checks that the PUZZLE_01 matrix is not null and has the expected dimensions.
     */
    @Test
    public void testPuzzle01() {
        // Verifica que la matriz PUZZLE_01 no sea nula y tenga las dimensiones esperadas
        assertNotNull(SamplePuzzles.PUZZLE_01);
        assertEquals(7, SamplePuzzles.PUZZLE_01.length);
        assertEquals(7, SamplePuzzles.PUZZLE_01[0].length);

    }
    /**
     * @brief Test for the PUZZLE_02 matrix in SamplePuzzles.
     * @details This test checks that the PUZZLE_02 matrix is not null and has the expected dimensions.
     */
    @Test
    public void testPuzzle02() {
        // Verifica que la matriz PUZZLE_02 no sea nula y tenga las dimensiones esperadas
        assertNotNull(SamplePuzzles.PUZZLE_02);
        assertEquals(10, SamplePuzzles.PUZZLE_02.length);
        assertEquals(10, SamplePuzzles.PUZZLE_02[0].length);
    }
    /**
     * @brief Test for the PUZZLE_03 matrix in SamplePuzzles.
     * @details This test checks that the PUZZLE_03 matrix is not null and has the expected dimensions.
     */
    @Test
    public void testPuzzle03() {
        // Verifica que la matriz PUZZLE_03 no sea nula y tenga las dimensiones esperadas
        assertNotNull(SamplePuzzles.PUZZLE_03);
        assertEquals(7, SamplePuzzles.PUZZLE_03.length);
        assertEquals(7, SamplePuzzles.PUZZLE_03[0].length);

    }
    /**
     * @brief Test for the PUZZLE_04 matrix in SamplePuzzles.
     * @details This test checks that the PUZZLE_04 matrix is not null and has the expected dimensions.
     */
    @Test
    public void testPuzzle04() {
        // Verifica que la matriz PUZZLE_04 no sea nula y tenga las dimensiones esperadas
        assertNotNull(SamplePuzzles.PUZZLE_04);
        assertEquals(10, SamplePuzzles.PUZZLE_04.length);
        assertEquals(10, SamplePuzzles.PUZZLE_04[0].length);

    }
    /**
     * @brief Test for the PUZZLE_05 matrix in SamplePuzzles.
     * @details This test checks that the PUZZLE_05 matrix is not null and has the expected dimensions.
     */
    @Test
    public void testPuzzle05() {
        // Verifica que la matriz PUZZLE_05 no sea nula y tenga las dimensiones esperadas
        assertNotNull(SamplePuzzles.PUZZLE_05);
        assertEquals(7, SamplePuzzles.PUZZLE_05.length);
        assertEquals(6, SamplePuzzles.PUZZLE_05[0].length);

    }
    /**
     * @brief Test for the PUZZLE_06 matrix in SamplePuzzles.
     * @details This test checks that the PUZZLE_06 matrix is not null and has the expected dimensions.
     */
    @Test
    public void testPuzzle06() {
        // Verifica que la matriz PUZZLE_06 no sea nula y tenga las dimensiones esperadas
        assertNotNull(SamplePuzzles.PUZZLE_06);
        assertEquals(8, SamplePuzzles.PUZZLE_06.length);
        assertEquals(8, SamplePuzzles.PUZZLE_06[0].length);

    }
    /**
     * @brief Test for the PUZZLE_07 matrix in SamplePuzzles.
     * @details This test checks that the PUZZLE_07 matrix is not null and has the expected dimensions.
     */
    @Test
    public void testPuzzle07() {
        // Verifica que la matriz PUZZLE_07 no sea nula y tenga las dimensiones esperadas
        assertNotNull(SamplePuzzles.PUZZLE_07);
        assertEquals(10, SamplePuzzles.PUZZLE_07.length);
        assertEquals(10, SamplePuzzles.PUZZLE_07[0].length);

    }
    /**
     * @brief Test for the PUZZLE_08 matrix in SamplePuzzles.
     * @details This test checks that the PUZZLE_08 matrix is not null and has the expected dimensions.
     */
    @Test
    public void testPuzzle08() {
        // Verifica que la matriz PUZZLE_08 no sea nula y tenga las dimensiones esperadas
        assertNotNull(SamplePuzzles.PUZZLE_08);
        assertEquals(10, SamplePuzzles.PUZZLE_08.length);
        assertEquals(10, SamplePuzzles.PUZZLE_08[0].length);

    }
    /**
     * @brief Test for the PUZZLE_EXPERTO matrix in SamplePuzzles.
     * @details This test checks that the PUZZLE_EXPERTO matrix is not null and has the expected dimensions.
     */
    @Test
    public void testPuzzleExperto() {
        // Verifica que la matriz PUZZLE_EXPERTO no sea nula y tenga las dimensiones esperadas
        assertNotNull(SamplePuzzles.PUZZLE_EXPERTO);
        assertEquals(10, SamplePuzzles.PUZZLE_EXPERTO.length);
        assertEquals(10, SamplePuzzles.PUZZLE_EXPERTO[0].length);

    }
    /**
     * @brief Test for the PUZZLE_EXPERTO_REAL matrix in SamplePuzzles.
     * @details This test checks that the PUZZLE_EXPERTO_REAL matrix is not null and has the expected dimensions.
     */
    @Test
    public void testPuzzleExpertoReal() {
        // Verifica que la matriz PUZZLE_EXPERTO_REAL no sea nula y tenga las dimensiones esperadas
        assertNotNull(SamplePuzzles.PUZZLE_EXPERTO_REAL);
        assertEquals(14, SamplePuzzles.PUZZLE_EXPERTO_REAL.length);
        assertEquals(14, SamplePuzzles.PUZZLE_EXPERTO_REAL[0].length);

    }



}
