package za.web.skerwe.adventofcode;

import java.io.IOException;

import za.web.skerwe.adventofcode.Day6;
import za.web.skerwe.util.InputFileReader;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.BeforeClass;

public class Day6Test {

  private static Day6 challenge;
  private static int[] input;

  @BeforeClass
  public static void setup() throws IOException {
    challenge = new Day6();
    input = Day6.convertToIntArray(InputFileReader.readInputFile("input/day06.txt")[0]);
  }

  @Test
  public void testPart1() {
    assertEquals(6681, challenge.part1(input));
  }

  @Test
  public void testPart2() {
    assertEquals(2392, challenge.part2(input));
  }

}
