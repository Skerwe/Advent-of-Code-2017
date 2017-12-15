package za.web.skerwe.util;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class InputFileReader {

  public static String[] readInputFile(String fileName) throws IOException {
    List<String> lines = new ArrayList<>();

    BufferedReader inputStream = new BufferedReader(new FileReader(fileName));
    // TODO: Java 1.8
    // String[] lines = inputStream.lines().toArray();
    // System.out.println("Length="+lines.length);
    String line;
    while ((line = inputStream.readLine()) != null) {
      lines.add(line);
    }

    return lines.toArray(new String[0]);
  }

}
