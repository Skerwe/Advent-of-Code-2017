package za.web.skerwe.adventofcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Day 4: High-Entropy Passphrases
 */
public class Day4 {

  public int part1(String[] input) {
    int total = 0;
    for (String passphrase : input) {
      Map<String, Integer> wordMap = new HashMap<String, Integer>();

      String[] words = passphrase.split(" ");
      if (words.length > 1 && isValidpassphrases(wordMap, words)) {
        total++;
      }
    }
    return total;
  }

  public int part2(String[] input) {
    int total = 0;
    for (String passphrase : input) {
      Map<String, Integer> wordMap = new HashMap<String, Integer>();

      boolean valid = true;
      String[] words = passphrase.split(" ");
      if (words.length > 1 && isValidpassphrases(wordMap, words)) {
        for (int i = 0; i < words.length - 1; i++) {
          for (int j = i + 1; j < words.length; j++) {
            if (isAnagram(words[i], words[j])) {
              valid = false;
              break;
            }
          }
        }
      } else {
        valid = false;
      }

      if (valid) {
        total++;
      }
    }
    return total;
  }

  private boolean isValidpassphrases(Map<String, Integer> wordMap, String[] words) {
    boolean valid = true;
    for (String word : words) {
      Integer count = wordMap.get(word);
      if (count == null) {
        wordMap.put(word, 1);
      } else {
        wordMap.put(word, ++count);
        valid = false;
        break;
      }
    }
    return valid;
  }

  private static boolean isAnagram(String s1, String s2) {
    // Early termination check, if strings are of unequal lengths,
    // then they cannot be anagrams
    if (s1.length() != s2.length()) {
      return false;
    }
    s1 = s1.toLowerCase();
    s2 = s2.toLowerCase();
    char[] c1 = s1.toCharArray();
    char[] c2 = s2.toCharArray();
    Arrays.sort(c1);
    Arrays.sort(c2);
    String sc1 = new String(c1);
    String sc2 = new String(c2);
    return sc1.equals(sc2);
  }
}
