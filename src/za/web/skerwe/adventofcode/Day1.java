package za.web.skerwe.adventofcode;

import java.io.IOException;
import za.web.skerwe.util.InputFileReader;

public class Day1 {

    public static void main(String[] args) {
      try {
        String[] input = InputFileReader.readInputFile("input/day01.txt");
        Day1 challenge = new Day1();

        System.out.println(String.format("Solution to the captcha = %s", challenge.part1(input[0])));
        System.out.println(String.format("Solution to the new captcha = %s", challenge.part2(input[0])));

      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    public int part1(String input) {
      return solveCaptcha(input, 1);
    }

    public int part2(String input) {
      return solveCaptcha(input, input.length()/2);
    }

    private int solveCaptcha(String input, int inc) {
        int total = 0;
        for (int i = 0, next ; i < input.length(); i++) {
            next = i;
            if (next + inc >= input.length()) {
                next = next + inc - input.length();
            } else {
                next = next + inc;
            }
            if (input.charAt(i) == input.charAt(next)) {
                total += Character.getNumericValue(input.charAt(i));
            }
        }
        return total;
    }
}
