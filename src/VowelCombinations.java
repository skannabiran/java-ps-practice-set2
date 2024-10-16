import java.util.HashSet;
import java.util.Set;

public class VowelCombinations {

  private Set<String> wordCombinationSet = new HashSet<>();

  public static void main(String[] args) {
    String input = "abcde";
    VowelCombinations vowelCombinations = new VowelCombinations();
    Set<String> result = vowelCombinations.findWordWithVowelCombinations(input);

    System.out.println("Combinations that start and end with a vowel:");
    for (String combination : result) {
      System.out.println(combination);
    }
  }

  // Method to find all unique combinations
  public Set<String> findWordWithVowelCombinations(String str) {
    generateCombinations(str, "");
    return filterWordWithVowelCombinations();
  }

  // Recursive method to generate all the possible word combinations
  private void generateCombinations(String in, String out) {
    // If input string is empty
    if (in.isEmpty()) {
      wordCombinationSet.add(out);
      return;
    }
    for (int i = 0; i < in.length(); i++) {
      // Rest of the string after excluding the ith character
      String remaining = in.substring(0, i) + in.substring(i + 1);
      // Recursive call
      generateCombinations(remaining, out + in.charAt(i));
    }
  }

  // Method to find and filter the word combinations that start and end with a vowel
  private Set<String> filterWordWithVowelCombinations() {
    Set<String> filtered = new HashSet<>();
    for (String combo : wordCombinationSet) {
      if (isVowel(combo.charAt(0)) && isVowel(combo.charAt(combo.length() - 1))) {
        filtered.add(combo);
      }
    }
    return filtered;
  }

  // Method to check if a character is a vowel
  private boolean isVowel(char c) {
    return "AEIOUaeiou".indexOf(c) != -1;
  }
}
