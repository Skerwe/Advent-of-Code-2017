package za.web.skerwe.adventofcode;

import java.io.IOException;
import za.web.skerwe.util.InputFileReader;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.BeforeClass;

public class Day1Test {

  private static Day1 challenge;
  private static String[] input;

  @BeforeClass
  public static void setup() throws IOException {
    challenge = new Day1();
    input = InputFileReader.readInputFile("input/day01.txt");
  }

  @Test
  public void testPart1() {
    assertEquals(1141, challenge.part1(input[0]));
  }

  @Test
  public void testPart2() {
    assertEquals(950, challenge.part2(input[0]));
  }

}
