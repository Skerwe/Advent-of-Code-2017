package za.web.skerwe.adventofcode;

import java.io.IOException;
import za.web.skerwe.util.InputFileReader;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.BeforeClass;

public class Day2Test {

  private static Day2 challenge;
  private static String[] input;

  @BeforeClass
  public static void setup() throws IOException {
    challenge = new Day2();
    input = InputFileReader.readInputFile("input/day02.txt");
  }

  @Test
  public void testPart1() {
    assertEquals(50376, challenge.part1(input));
  }

  @Test
  public void testPart2() {
    assertEquals(267, challenge.part2(input));
  }

}
