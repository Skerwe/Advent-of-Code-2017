package za.web.skerwe.adventofcode;

/**
 * Day 3: Spiral Memory
 *
 * http://www.guideforschool.com/1260759-java-program-to-print-circular-spiral-matrix/
 * http://www.guideforschool.com/1728514-java-program-to-print-a-variation-of-circular-spiral-matrix/
 */
public class Day3 {

  public int part1(int input) {

    int manhattanDistance;
    int destinationRow = 0, destinationColumn = 0, startRow = 0, startColumn = 0;

    int numberOfElements = calculateMatrixElementSize(input);

    int[][] matrix = circularMatrix(numberOfElements);

    for (int i = 0; i < numberOfElements; i++) {
      for (int j = 0; j < numberOfElements; j++) {
        if (matrix[i][j] == 1) {
          destinationColumn = j;
          destinationRow = i;
        }
        if (matrix[i][j] == input) {
          startColumn = j;
          startRow = i;
        }
      }
    }

    manhattanDistance = calculateManhattanDistance(startRow, startColumn, destinationRow, destinationColumn);

    return manhattanDistance;
  }

  public int part2(int input) {

    int startRow = 0, startColumn = 0;
    int numberOfElements = calculateMatrixElementSize(input);
    int[][] m = new int[numberOfElements][numberOfElements];

    int[][] matrix = circularMatrix(numberOfElements);

    matrix: for (int i = 0; i < numberOfElements; i++) {
      for (int j = 0; j < numberOfElements; j++) {
        if (matrix[i][j] == 1) {
          startRow = i;
          startColumn = j;
          break matrix;
        }
      }
    }

    // store the value 1 in square 1
    m[startRow][startColumn] = 1;

    do {
      int next = nextVlaue(startRow, startColumn, matrix);
      if (next == 0) {
        return -1;
      }
      if (next == 1) {
        startRow--;
      }
      if (next == 2) {
        startColumn--;
      }
      if (next == 3) {
        startRow++;
      }
      if (next == 4) {
        startColumn++;
      }
      m[startRow][startColumn] = calculateValue(startRow, startColumn, m);
    } while (m[startRow][startColumn] <= input);

    return m[startRow][startColumn];
  }

  /**
   * Finds the next value in the sequence. 1 = NORTH, 2 WEST, 3 = SOUTH, 4 = EAST
   *
   * @param r current row index
   * @param c current column index
   * @param a the 2d array to use
   * @return the next location
   */
  private int nextVlaue(int r, int c, int[][] a) {

    if (r - 1 >= 0) {
      if (a[r - 1][c] == (a[r][c] + 1)) {
        return 1;
      }
    }
    if (c - 1 >= 0) {
      if (a[r][c - 1] == (a[r][c] + 1)) {
        return 2;
      }
    }
    if (r + 1 < a.length) {
      if (a[r + 1][c] == (a[r][c] + 1)) {
        return 3;
      }
    }
    if (c + 1 < a.length) {
      if (a[r][c + 1] == (a[r][c] + 1)) {
        return 4;
      }
    }
    return 0;
  }

  /**
   * Calculate the sum of the values in all adjacent squares, including diagonals.
   *
   * @param r the current row index
   * @param c the current column index
   * @param a the 2d array to use
   * @return the sum of all adjacent squares
   */
  private int calculateValue(int r, int c, int[][] a) {
    int total = 0;
    if (r - 1 >= 0) { // NORTH
      if (a[r - 1][c] > 0) {
        total += a[r - 1][c];
      }
    }
    if (c - 1 >= 0) { // WEST
      if (a[r][c - 1] >= 0) {
        total += a[r][c - 1];
      }
    }
    if (r + 1 < a.length) { // SOUTH
      if (a[r + 1][c] > 0) {
        total += a[r + 1][c];
      }
    }
    if (c + 1 < a.length) { // EAST
      if (a[r][c + 1] > 0) {
        total += a[r][c + 1];
      }
    }

    if (r - 1 >= 0 && c - 1 >= 0) { // NORTH WEST
      if (a[r - 1][c - 1] > 0) {
        total += a[r - 1][c - 1];
      }
    }
    if (c - 1 >= 0 && r + 1 < a.length) { // SOUTH WEST
      if (a[r + 1][c - 1] >= 0) {
        total += a[r + 1][c - 1];
      }
    }
    if (r + 1 < a.length && c + 1 < a.length) { // SOUTH EAST
      if (a[r + 1][c + 1] > 0) {
        total += a[r + 1][c + 1];
      }
    }
    if (c + 1 < a.length && r - 1 >= 0) { // NOTH EAST
      if (a[r - 1][c + 1] > 0) {
        total += a[r - 1][c + 1];
      }
    }

    return total;
  }

  /**
   * Calculate the Manhattan distance between starting position and destination
   * location.
   *
   * @param positionRow    starting position row
   * @param positionColumn starting position column
   * @param goalRow        destination row
   * @param goalColumn     destination column
   * @return Manhattan distance
   */
  private int calculateManhattanDistance(int positionRow, int positionColumn, int goalRow, int goalColumn) {
    return Math.abs(positionRow - positionColumn) + Math.abs(goalRow - goalColumn);
  }

  private int calculateMatrixElementSize(int value) {
    int size = (int) Math.round(Math.sqrt(value));
    if ((size * size) < value) {
      size = calculateMatrixElementSize(value + size);
    }
    return size;
  }

  /** This builds the outward spiral array */
  private int[][] circularMatrix(int n) {

    int matrix[][] = new int[n][n];
    int k = n * n, c1 = 0, c2 = n - 1, r1 = 0, r2 = n - 1;

    while (k >= 1) {
      for (int i = c1; i <= c2; i++) {
        matrix[r1][i] = k--;
      }

      for (int j = r1 + 1; j <= r2; j++) {
        matrix[j][c2] = k--;
      }

      for (int i = c2 - 1; i >= c1; i--) {
        matrix[r2][i] = k--;
      }

      for (int j = r2 - 1; j >= r1 + 1; j--) {
        matrix[j][c1] = k--;
      }

      c1++;
      c2--;
      r1++;
      r2--;
    }

    return matrix;
  }
}
