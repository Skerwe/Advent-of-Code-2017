package za.web.skerwe.adventofcode;

import java.io.IOException;
import za.web.skerwe.util.InputFileReader;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.BeforeClass;

public class Day4Test {

  private static Day4 challenge;
  private static String[] input;

  @BeforeClass
  public static void setup() throws IOException {
    challenge = new Day4();
    input = InputFileReader.readInputFile("input/day04.txt");
  }

  @Test
  public void testPart1() {
    assertEquals(466, challenge.part1(input));
  }

  @Test
  public void testPart2() {
    assertEquals(251, challenge.part2(input));
  }

}
