package za.web.skerwe.adventofcode;

import java.io.IOException;
import za.web.skerwe.util.InputFileReader;

public class Day10 {

  public static byte[] standardLengthSuffixValues = {17, 31, 73, 47, 23};

    public static void main(String[] args) {
      try {
        String[] input = InputFileReader.readInputFile("input/day10.txt");
        Day10 challenge = new Day10();

        System.out.println(String.format("Result of multiplying the first two numbers in the list = %s", challenge.part1(input[0])));
        System.out.println(String.format("Knot Hash = %s", challenge.part2(input[0])));

      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    public int part1(String input) {
      String[] parts = input.split(",");
      int[] lengths = new int[parts.length];
      for (int i = 0; i < parts.length; i++) {
        lengths[i] = Integer.parseInt(parts[i]);
      }

      int[] hashString = makeHashString();

      Model model = new Model();
      model.setLengths(lengths);
      model.setHashString(hashString);

      method(model);
      return hashString[0] * hashString[1];
    }

    public String part2(String input) {
      int[] lengths = Day10.combineByteArrayToIntArray(input.getBytes(), Day10.standardLengthSuffixValues);
      int[] hashString = makeHashString();

      Model model = new Model();
      model.setLengths(lengths);
      model.setHashString(hashString);

      int round = 0;
      while (round < 64) {
        method(model);
        round++;
      }

      int[] sparseHash = new int[16];
      for (int hash = 0; hash < 16; hash++) {
          int value = 0;
          for (int i = (hash * 16), j = (hash * 16) + 16; i < j; i++) {
              value = value ^ model.hashString[i];
          }
          sparseHash[hash] = value;
      }

      StringBuilder buffer = new StringBuilder();
      for (int v : sparseHash) {
          String h = Integer.toHexString(v);
          buffer.append(h.length() == 1 ? ("0" + h) : h);
      }

      return buffer.toString();
    }

    private int[] makeHashString() {
      int[] hashString = new int[256];
      for (int i = 0; i < hashString.length; i++) {
        hashString[i] = i;
      }
      return hashString;
    }

    public static int[] combineByteArrayToIntArray(byte[] a, byte[] b) {
        int length = a.length + b.length;
        int[] result = new int[length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }
        for (int i = a.length, j = 0; j < b.length; i++, j++) {
            result[i] = b[j];
        }
        return result;
    }

    public void method(Model model) {

      for (int i = 0; i < model.lengths.length; i++) {
        int[] hashStringClone = model.hashString.clone();
        int b = model.currentPosition + model.lengths[i] - 1;
        if (b >= model.hashString.length) {
          b = b - model.hashString.length;
        }

        for (int step = 0, c = model.currentPosition; step < model.lengths[i]; step++, c++, b--) {
          if (b == -1) {
            b = model.hashString.length - 1;
          }
          if (c == model.hashString.length) {
            c = 0;
          }
          model.hashString[c] = hashStringClone[b];
        }

        model.currentPosition += model.lengths[i] + model.skipSize;
        model.skipSize++;

        while (model.currentPosition >= model.hashString.length) {
          model.currentPosition = model.currentPosition - model.hashString.length;
        }
      }
    }

    class Model {

      private int[] lengths;
      private int[] hashString;

      private int currentPosition;
      private int skipSize;

      public int[] getLengths() {
        return this.lengths;
      }

      public void setLengths(int[] lengths) {
        this.lengths = lengths;
      }

      public int[] getHashString() {
        return this.hashString;
      }

      public void setHashString(int[] hashString) {
        this.hashString = hashString;
      }

      public int getCurrentPosition() {
        return this.currentPosition;
      }

      public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
      }

      public int getSkipSize() {
        return this.skipSize;
      }

      public void setSkipSize() {
        this.skipSize = skipSize;
      }
    }
}
