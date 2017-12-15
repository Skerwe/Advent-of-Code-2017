package za.web.skerwe.adventofcode;

import java.awt.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Day14 {

    public static void main(String[] args) {
        String input = "stpzcrnm";

        Day14 challenge = new Day14();
        System.out.println(String.format("Squares are used = %d", challenge.part1(input, 128)));
        System.out.println(String.format("How many regions = %d", challenge.part2(input, 128)));
    }

    public int part1(String input, int size) {
      int used = 0;
      int[][] registry = buildRegistry(input, size);
      for (int i = 0; i < size; i++) {
          for (int c = 0; c < registry[i].length; c++) {
              if (registry[i][c] == 1) {
                  used++;
              }
          }
      }
      return used;
    }

    public int part2(String input, int size) {
      int[][] registry = buildRegistry(input, size);
      int[][] regions = new int[size][size];
      int regionCount = 0;

      for (int i = 0; i < size; i++) {
          for (int j = 0; j < size; j++) {
              int v = registry[i][j];
              if (v == 1) {
                  List<Point> group = new ArrayList<>();
                  formRegion(i, j, registry, regions, group);

                  if (group.size() > 0) {
                      regionCount++;
                      for (Point p : group) {
                          regions[p.x][p.y] = regionCount;
                      }
                  }

              }
          }
      }
      return regionCount;
    }

    private int[][] buildRegistry(String input, int size) {
      String[] knotHashes = new String[size];
      int[][] registry = new int[size][size];

      Day10 day10 = new Day10();
      for (int i = 0; i < size; i++) {
          String knotHash = day10.part2(input+"-"+i);

          StringBuilder builder = new StringBuilder();
          for (int j = 0; j < knotHash.length(); j++) {
              String bit = hexToBin(knotHash.substring(j, j+1));
              for (int k = bit.length(); k < 4; k++) {
                  builder.append("0");
              }
              builder.append(bit);
          }
          knotHashes[i] = builder.toString();
      }

      for (int i = 0; i < size; i++) {
          for (int c = 0; c < knotHashes[i].length(); c++) {
              registry[i][c] = Integer.parseInt(knotHashes[i].substring(c, c+1));
          }
      }

      return registry;
    }

    private void formRegion(int i, int j, int[][] d, int[][] r, List<Point> group) {
        if (r[i][j] == 0) {
            r[i][j] = -1;
            group.add(new Point(i, j));
        } else if (r[i][j] > 0) {
            return;
        }

        if(i-1 >= 0) {
            if (d[i-1][j] != 0 && r[i-1][j] != -1) {
                formRegion(i-1, j, d, r, group);
            }
        }

        if(j-1 >= 0) {
            if (d[i][j-1] != 0 && r[i][j-1] != -1) {
                formRegion(i, j-1, d, r, group);
            }
        }

        if (i+1 < d.length) {
            if (d[i+1][j] != 0 && r[i+1][j] != -1) {
                formRegion(i+1, j, d, r, group);
            }
        }

        if (j+1 < d[i].length) {
            if (d[i][j+1] != 0 && r[i][j+1] != -1) {
                formRegion(i, j+1, d, r, group);
            }
        }

    }

    static String hexToBin(String s) {
        return new BigInteger(s, 16).toString(2);
    }
}
