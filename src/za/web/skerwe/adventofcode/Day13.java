package za.web.skerwe.adventofcode;

import java.io.IOException;
import za.web.skerwe.util.InputFileReader;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Day13 {

    public static void main(String[] args) {
      try {
        String[] input = InputFileReader.readInputFile("input/day13.txt");

        Day13 challenge = new Day13();
        System.out.println(String.format("Severity of the whole trip = %s", challenge.part1(input)));
        System.out.println(String.format("The fewest number of picoseconds = %s", challenge.part2(input)));

      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    public int part1(String[] input) {
        List<Scan> firewall = buildFirewall(input);
        int severity = 0;

        for (Scan scan : firewall) {
            int interval = (scan.range * 2) - 2;
            if (scan.depth % interval == 0) {
                severity += scan.depth * scan.range;
            }
        }

      return severity;
    }

    public int part2(String[] input) {
        List<Scan> firewall = buildFirewall(input);
        int picoseconds = 0;
        boolean complete;

        do {
            complete = true;
            for (Scan scan : firewall) {
                int interval = (scan.range * 2) - 2;
                if ((scan.depth + picoseconds) % interval == 0) {
                    picoseconds++;
                    complete = false;
                    break;
                }
            }
        } while (!complete);

        return picoseconds;
    }

    private List<Scan> buildFirewall(String[] input) {
        List<Scan> firewall = new ArrayList<>();

        for (String scanner : input) {
            String[] data = scanner.split(" ");
            int depth = Integer.parseInt(data[0].replace(':', ' ').trim());
            int range = Integer.parseInt(data[1].replace(':', ' ').trim());
            firewall.add(new Scan(depth, range));
        }
        return firewall;
    }

    private class Scan {

        public int depth;
        public int range;

        public Scan(int depth, int range) {
            this.depth = depth;
            this.range = range;
        }
    }
}
