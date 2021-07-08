package za.web.skerwe.adventofcode;

public class Day5 {

  public int part1(int[] input) {
    int currentPosition = 0, jumpValue = 0, steps = 0;
    while (currentPosition >= 0 && currentPosition < input.length) {
      jumpValue = input[currentPosition];
      input[currentPosition] = input[currentPosition] + 1;

      currentPosition += jumpValue;
      steps++;
    }
    return steps;
  }

  public int part2(int[] input) {
    int currentPosition = 0, jumpValue = 0, steps = 0;
    while (currentPosition >= 0 && currentPosition < input.length) {
      jumpValue = input[currentPosition];
      if (jumpValue >= 3) {
        input[currentPosition] = input[currentPosition] - 1;
      } else {
        input[currentPosition] = input[currentPosition] + 1;
      }

      currentPosition += jumpValue;
      steps++;
    }
    return steps;
  }

  public int[] convertInputStringToInt(String[] input) {
    int[] stepsArray = new int[input.length];
    for (int i = 0; i < input.length; i++) {
      stepsArray[i] = Integer.parseInt(input[i]);
    }
    return stepsArray;
  }
}
