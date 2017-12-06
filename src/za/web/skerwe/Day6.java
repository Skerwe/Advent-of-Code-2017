package services.workplaceLivingServices.test.manual;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day6 {

    public static void main(String[] args) {

        int[] input = {4,1,15,12,0,9,9,5,5,8,7,3,14,5,12,3};
        new Day6().process(input);
    }

    private void process(int[] input) {
        List<int[]> bank = new ArrayList<>();
        int cycles = 0, infCycles = 0;

        while (!checkConfigSeenBefore(input, bank)) {
            redistribute(input);
            cycles++;
        }

        bank.clear();
        while (!checkConfigSeenBefore(input, bank)) {
            redistribute(input);
            infCycles++;
        }

        System.out.println("\nRedistribution cycles="+cycles);
        System.out.println("How many cycles="+infCycles);
    }

    private void redistribute(int[] input) {
        int index = findMostBlocksIndex(input);
        int value = input[index];
        input[index] = 0;
        for (int i = index + 1; value > 0; i++, value--) {
            if (i == input.length) { i = 0; }
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
