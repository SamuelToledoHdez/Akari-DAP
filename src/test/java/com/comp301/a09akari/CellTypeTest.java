package com.comp301.a09akari;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import com.comp301.a09akari.controller.*;
import com.comp301.a09akari.model.*;
import com.comp301.a09akari.view.*;
import static org.junit.jupiter.api.Assertions.*;

public class CellTypeTest {

  @Test
  public void testClueCellType() {
    assertEquals(CellType.CLUE, CellType.valueOf("CLUE"));
  }

  @Test
  public void testCorridorCellType() {
    assertEquals(CellType.CORRIDOR, CellType.valueOf("CORRIDOR"));
  }

  @Test
  public void testWallCellType() {
    assertEquals(CellType.WALL, CellType.valueOf("WALL"));
  }
}

