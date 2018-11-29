package za.web.skerwe.adventofcode;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.BeforeClass;

public class Day3Test {

  private static Day3 challenge;
  private static int input = 312051;

  @BeforeClass
  public static void setup() {
    challenge = new Day3();
  }

  @Test
  public void testPart1() {
    assertEquals(430, challenge.part1(input));
  }

  @Test
  public void testPart2() {
    assertEquals(312453, challenge.part2(input));
  }

}
