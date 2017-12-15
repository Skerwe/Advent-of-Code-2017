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
        HashMap<Integer, Scan> firewall = new HashMap<>();
        int severity = 0, position = 0;

        int destination = buildFirewall(input, firewall);

        while (position <= destination) {
            Scan scan = firewall.get(position);
            if (scan != null && scan.getCurrentPosition() == 0) {
                severity += (scan.getDepth() * scan.getRange());
            }
            update(firewall);
            position++;
        }

        return severity;
    }

    public int part2(String[] input) {
      HashMap<Integer, Scan> firewall = new HashMap<>();

      int destination = buildFirewall(input, firewall);

      return 0;
    }

  /**
   * Build the firewall matrix and returns the furthest location's index.
   * @param  String[]         input         the firewall and scanner data
   * @param  HashMap<Integer, Scan>         firewall      the firewall matrix
   * @return                  the final scanner in the firewall's index
   */
    public int buildFirewall(String[] input, HashMap<Integer, Scan> firewall) {
        int destination = 0;

        for (String scanner : input) {

            String[] data = scanner.split(" ");
            int depth = Integer.parseInt(data[0].replace(':', ' ').trim());
            int range = Integer.parseInt(data[1].replace(':', ' ').trim());
            firewall.put(depth, new Scan(depth, range));

            if (depth > destination) {
                destination = depth;
            }
        }
        return destination;
    }

    public void update(HashMap<Integer, Scan> firewall) {
        for (Scan scan : firewall.values()) {
            scan.move();
        }
    }

    class Scan {

        private int depth;
        private int range;

        private int currentPosition;
        private int direction;

        public Scan(int depth, int range) {
            this.depth = depth;
            this.range = range;

            this.currentPosition = 0;
            this.direction = 1;
        }

        public void move() {
            currentPosition += direction;
            if (currentPosition == range-1) {
                direction = -1;
            }
            if (currentPosition == 0) {
                direction = 1;
            }
        }

        public Scan clone() {
            Scan clone = new Scan(this.depth, this.range);
            clone.setCurrentPosition(this.currentPosition);
            clone.setDirection(this.direction);
            return clone;
        }

        public int getDepth() {
            return depth;
        }

        public void setDepth(int depth) {
            this.depth = depth;
        }

        public int getRange() {
            return range;
        }

        public void setRange(int range) {
            this.range = range;
        }

        public int getCurrentPosition() {
            return currentPosition;
        }

        public void setCurrentPosition(int currentPosition) {
            this.currentPosition = currentPosition;
        }

        public int getDirection() {
            return direction;
        }

        public void setDirection(int direction) {
            this.direction = direction;
        }

        @Override
        public String toString() {
            return "Scan{" +
                    "depth=" + depth +
                    ", range=" + range +
                    ", currentPosition=" + currentPosition +
                    ", direction=" + direction +
                    '}';
        }
      }
}
