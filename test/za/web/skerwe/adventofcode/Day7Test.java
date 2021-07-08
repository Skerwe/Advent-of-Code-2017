package za.web.skerwe.adventofcode;

import java.io.IOException;
import za.web.skerwe.util.InputFileReader;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.BeforeClass;

public class Day7Test {

  private static Day7 challenge;
  private static String[] input;

  @BeforeClass
  public static void setup() throws IOException {
    challenge = new Day7();
    input = InputFileReader.readInputFile("input/day07.txt");
  }

  @Test
  public void testPart1() {
    assertEquals("xegshds", challenge.part1(input));
  }

  @Test
  public void testPart2() {
    assertEquals(299, challenge.part2(input));
  }

}
