/**
 * @file CellTypeTest.java
 * @brief This file contains the unit tests for the CellType enumeration.
 */
package com.comp301.a09akari;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import com.comp301.a09akari.controller.*;
import com.comp301.a09akari.model.*;
import com.comp301.a09akari.view.*;
import static org.junit.jupiter.api.Assertions.*;
/**
 * @brief This class contains unit tests for the CellType enumeration.
 */
public class CellTypeTest {
  /**
   * @brief Test for the CLUE CellType.
   * @details This test checks if the valueOf("CLUE") method of the CellType enumeration returns
   * the expected CellType value.
   */
  @Test
  public void testClueCellType() {
    assertEquals(CellType.CLUE, CellType.valueOf("CLUE"));
  }
  /**
   * @brief Test for the CORRIDOR CellType.
   * @details This test checks if the valueOf("CORRIDOR") method of the CellType enumeration returns
   * the expected CellType value.
   */
  @Test
  public void testCorridorCellType() {
    assertEquals(CellType.CORRIDOR, CellType.valueOf("CORRIDOR"));
  }
   /**
   * @brief Test for the WALL CellType.
   * @details This test checks if the valueOf("WALL") method of the CellType enumeration returns
   * the expected CellType value.
   */
  @Test
  public void testWallCellType() {
    assertEquals(CellType.WALL, CellType.valueOf("WALL"));
  }
}

