package za.web.skerwe.adventofcode;

import java.io.IOException;
import za.web.skerwe.util.InputFileReader;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.Before;

public class Day5Test {

  private static Day5 challenge;
  private static int[] input;

  @BeforeClass
  public static void setup() {
    challenge = new Day5();
  }

  @Before
  public void init() throws IOException {
    input = challenge.convertInputStringToInt(InputFileReader.readInputFile("input/day05.txt"));
  }

  @Test
  public void testPart1() {
    assertEquals(356945, challenge.part1(input));
  }

  @Test
  public void testPart2() {
    assertEquals(28372145, challenge.part2(input));
  }

}
