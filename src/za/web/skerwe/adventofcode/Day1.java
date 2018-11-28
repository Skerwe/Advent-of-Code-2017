package za.web.skerwe.adventofcode;

/**
  Day 1: Inverse Captcha
*/
public class Day1 {

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
