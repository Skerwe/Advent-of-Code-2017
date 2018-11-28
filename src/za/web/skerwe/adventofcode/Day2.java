package za.web.skerwe.adventofcode;

/**
  Day 2: Corruption Checksum
*/
public class Day2 {

    public int part1(String input) {
        int total = 0;
        String[] rows = input.split("\n");
        for (String row : rows) {

            String[] columns = row.split("\t");
            int largest = 0;
            int smallest = 0;

            for (String column : columns) {

                int value = Integer.parseInt(column);

                if (smallest == 0) { smallest = value;}
                if (value < smallest) {
                    smallest = value;
                } else if (value > largest) {
                    largest = value;
                }
            }
            total += (largest - smallest);
        }

        return total;
    }

    public int part2(String input) {
        int total = 0;
        String[] rows = input.split("\n");
        for (String row : rows) {
            String[] columns = row.split("\t");

            for (int i = 0; i < columns.length; i++) {
                if (i + 1 == columns.length) { break; }
                else {
                    for (int j = i + 1; j < columns.length; j++) {

                        float value1, value2;
                        float temp1 = Float.parseFloat((columns[i]));
                        float temp2 = Float.parseFloat(columns[j]);

                        if (temp1 > temp2) {
                            value1 = temp1;
                            value2 = temp2;
                        } else {
                            value1 = temp2;
                            value2 = temp1;
                        }

                        if ((value1 % value2) == 0) {
                            total += (value1 / value2);
                        }
                    }
                }
            }
        }

        return total;
    }
}
