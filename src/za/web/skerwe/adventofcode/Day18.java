package za.web.skerwe.adventofcode;

import java.io.IOException;
import za.web.skerwe.util.InputFileReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Day18 {

  public static void main(String[] args) {
    try {
      String[] input = InputFileReader.readInputFile("input/day18.txt");
      Day18 challenge = new Day18();

      System.out.println(String.format("Recovered frequency = %s", challenge.part1(input)));
      // System.out.println(String.format("Program 1 send %s values", challenge.part2(input)));

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public long part1(String[] input) {
    HashMap<String, Long> registers = new HashMap<>();
    long recoveredFrequency = 0, lastPlayedSound = 0;

    loop: for (int i = 0; i >= 0 && i < input.length; i++) {
      String[] instructions = input[i].split(" ");
      switch (instructions[0]) {
        case "snd":
          lastPlayedSound = registers.get(instructions[1]);
          break;
        case "set":
          registers.put(instructions[1], getAmount(instructions[2], registers));
          break;
        case "add":
          Long add = registers.get(instructions[1]);
          if (add == null) {
            add = 0L;
          }
          registers.put(instructions[1], add + getAmount(instructions[2], registers));
          break;
        case "mul":
          Long mul = registers.get(instructions[1]);
          if (mul == null) {
            mul = 0L;
          }
          registers.put(instructions[1], mul * getAmount(instructions[2], registers));
          break;
        case "mod":
          Long mod = registers.get(instructions[1]);
          if (mod == null) {
            mod = 0L;
          }
          registers.put(instructions[1], mod % getAmount(instructions[2], registers));
          break;
        case "rcv":
          Long rcv = registers.get(instructions[1]);
          if (rcv != null && rcv != 0) {
            recoveredFrequency = lastPlayedSound;
            break loop;
          }
          break;
        case "jgz":
          Long value = getAmount(instructions[1], registers);
          Long amount = getAmount(instructions[2], registers);
          if (value > 0L) {
            i += amount - 1;
          }
          break;
        default: {
          System.err.println("UNKNOWN COMMAND!");
          System.exit(1);
        }
      }
    }
    return recoveredFrequency;
  }

  public long part2(String input) {
    return 0L;
  }

  private long getAmount(String amount, HashMap<String, Long> registers) {
    try {
      return Long.parseLong(amount);
    } catch (NumberFormatException e) {
      Long value = registers.get(amount);
      if (value == null) {
        return 0L;
      } else {
        return value;
      }
    }
  }
  
}
