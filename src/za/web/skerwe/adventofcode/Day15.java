package za.web.skerwe.adventofcode;

import java.math.BigInteger;

public class Day15 {

    private static int generatorA_value = 618;
    private static int generatorB_value = 814;

    private static int div = 2147483647;

    public static void main(String[] args) {
        System.out.println("\nAnswer="+ new Day15().process2(generatorA_value, generatorB_value));
    }

    private int process(long nextValueA, long nextValueB) {
        int finalCount  = 0;
        int generatorA_factor = 16807;
        int generatorB_factor = 48271;

        for (int i = 0; i < 40_000_000; i++) {
            nextValueA = getOutput(nextValueA, generatorA_factor);
            String binA = intToBin(String.valueOf(nextValueA));

            nextValueB = getOutput(nextValueB, generatorB_factor);
            String binB = intToBin(String.valueOf(nextValueB));

            if (binA.substring(binA.length() - 16, binA.length()).equals(binB.substring(binB.length() - 16, binB.length()))) {
                finalCount++;
            }
        }

        return finalCount;
    }

    private int process2(long nextValueA, long nextValueB) {
        int finalCount  = 0;
        int generatorA_factor = 16807;
        int generatorB_factor = 48271;

        for (int i = 0; i < 5_000_000; i++) {

            nextValueA = getVlaueForA(nextValueA, generatorA_factor);
            String binA = intToBin(String.valueOf(nextValueA));

            nextValueB = getVlaueForB(nextValueB, generatorB_factor);
            String binB = intToBin(String.valueOf(nextValueB));

            if (binA.substring(binA.length() - 16, binA.length()).equals(binB.substring(binB.length() - 16, binB.length()))) {
                finalCount++;
            }
        }

        return finalCount;
    }

    private long getVlaueForA(long previousValue, int generatorA_factor) {

        long nextValueA = getOutput(previousValue, generatorA_factor);

        if (nextValueA % 4 != 0) {
            nextValueA = getVlaueForA(nextValueA, generatorA_factor);
        }
        return nextValueA;
    }
    private long getVlaueForB(long previousValue, int generatorB_factor) {
        long nextValueB = getOutput(previousValue, generatorB_factor);

        if (nextValueB % 8 != 0) {
            nextValueB = getVlaueForB(nextValueB, generatorB_factor);
        }
        return nextValueB;
    }

    static String intToBin(String s) {
        String value = new BigInteger(s, 10).toString(2);
        if (value.length() < 32) {
            StringBuilder b = new StringBuilder();
            for (int i = value.length(); i < 32; i++) {
                b.append("0");
            }
            b.append(value);
            value = b.toString();
        }
        return value;
    }

    private long getOutput(long previousValue, int factor) {
        return Math.abs(previousValue * factor % div);
    }
}
