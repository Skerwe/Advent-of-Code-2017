package za.web.skerwe.adventofcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day6 {

  public static int[] convertToIntArray(String line) {
    List<Integer> numbers = new ArrayList<>();
    String[] parts = line.split("\t");
    for (String part : parts) {
      numbers.add(Integer.parseInt(part));
    }

    int[] input = new int[numbers.size()];
    for (int i = 0; i < numbers.size(); i++) {
      input[i] = numbers.get(i);
    }

    return input;
  }

  public int part1(int[] input) {
    List<int[]> bank = new ArrayList<>();
    int cycles = 0;

    while (!checkConfigSeenBefore(input, bank)) {
      redistribute(input);
      cycles++;
    }

    System.out.println("\nRedistribution cycles=" + cycles);
    return cycles;
  }

  public int part2(int[] input) {
    List<int[]> bank = new ArrayList<>();
    int infCycles = 0;

    bank.clear();
    while (!checkConfigSeenBefore(input, bank)) {
      redistribute(input);
      infCycles++;
    }

    System.out.println("How many cycles=" + infCycles);
    return infCycles;
  }

  private void redistribute(int[] input) {
    int index = findMostBlocksIndex(input);
    int value = input[index];
    input[index] = 0;
    for (int i = index + 1; value > 0; i++, value--) {
      if (i == input.length) {
        i = 0;
      }
      input[i] = input[i] + 1;
    }
  }

  private int findMostBlocksIndex(int[] input) {
    int value = 0;
    int index = 0;

    for (int i = 0; i < input.length; i++) {
      if (input[i] > value) {
        value = input[i];
        index = i;
      } else if (input[i] == value) {
        if (i < index) {
          value = input[i];
          index = i;
        }
      }
    }

    return index;
  }

  private boolean checkConfigSeenBefore(int[] input, List<int[]> bank) {

    for (int[] config : bank) {
      if (Arrays.equals(input, config)) {
        return true;
      }
    }

    bank.add(input.clone());
    return false;
  }
}
