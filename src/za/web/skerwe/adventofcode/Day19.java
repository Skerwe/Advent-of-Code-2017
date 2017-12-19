package za.web.skerwe.adventofcode;

import java.io.IOException;
import za.web.skerwe.util.InputFileReader;

public class Day19 {

  private static final int UP = 0;
  private static final int DOWN = 1;
  private static final int LEFT = 2;
  private static final int RIGHT = 3;

  public static void main(String[] args) {
    try {
      String[] input = InputFileReader.readInputFile("input/day19.txt");
      new Day19().process(input);

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void process(String[] input) {
    StringBuilder letters = new StringBuilder();
    char[][] maze = buildMaze(input);
    int x = 0, y = 0, direction = DOWN, steps = 0;

    // find the starting point:
    for (int i = 0; i < maze[0].length; i++) {
      if (maze[0][i] == '|') {
        x = i;
        break;
      }
    }

    do {
      if (maze[y][x] == '+') {
        direction = findNextDirection(direction, maze, x, y);
        if (direction == -1) {
          break;
        }
      }

      if (maze[y][x] != '+' && maze[y][x] != '-' && maze[y][x] != '|') {
        letters.append(maze[y][x]);
      }

      if (direction == UP) {
        y -= 1;
      } else if (direction == DOWN) {
        y += 1;
      } else if (direction == LEFT) {
        x -= 1;
      } else if (direction == RIGHT) {
        x += 1;
      }

      steps++;

      if (maze[y][x] == ' ') {// end of maze found
        break;
      }
    } while(true);

    System.out.println(String.format("The letters that was seen: %s", letters.toString()));
    System.out.println(String.format("Steps taken: %s", steps));
  }

  private int findNextDirection(int direction, char[][] maze, int x, int y) {
    if (RIGHT != direction && (x-1) >= 0 && maze[y][x-1] != ' ') {
      return LEFT;
    }

    if (LEFT != direction && (x+1) < maze[y].length && maze[y][x+1] != ' ') {
      return RIGHT;
    }

    if (UP != direction && (y+1) < maze.length && maze[y+1][x] != ' ') {
      return DOWN;
    }

    if (DOWN != direction && (y-1) >= 0 && maze[y-1][x] != ' ') {
      return UP;
    }

    return -1;
  }

  private char[][] buildMaze(String[] input) {
    char[][] maze = new char[input.length][input[0].length()];
    for (int i = 0; i < input.length; i++) {
      maze[i] = input[i].toCharArray();
    }
    return maze;
  }
}
