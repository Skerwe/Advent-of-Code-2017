package za.web.skerwe.adventofcode;

import java.io.IOException;
import za.web.skerwe.util.InputFileReader;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
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
  public void testSolveCaptchaPart1() {
    assertEquals(1141, Day1Test.challenge.part1(input[0]));
  }

  @Test
  public void testSolveCaptchaPart2() {
    assertEquals(950, Day1Test.challenge.part2(input[0]));
  }

}
