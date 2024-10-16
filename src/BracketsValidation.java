import java.util.*;

public class BracketsValidation {

  public static void main(String[] args) {
    List<String> sampleStrings = Arrays.asList("{4+(2*1)-(3+7)}", "[{(a+b})]");
    for (String input : sampleStrings) {
      boolean result = validateBraces(input);
      System.out.println(input + "::" + result);
    }
  }

  public static boolean validateBraces(String inputStr) {
    Stack<Character> stack = new Stack<Character>();
    char[] charArray = inputStr.toCharArray();
    for (Character current : charArray) {
      // check whether current is '(', '[' or '{'
      if (current == '{' || current == '[' || current == '(') {
        // push current to stack
        stack.push(current);
        continue;
      }
      // use switch statement to pop element from stack and if it is '(', '[' or '{', return false
      char popChar;
      switch (current) {
        case ')' -> {
          popChar = stack.pop();
          if (popChar == '{' || popChar == '[') return false;
        }
        case '}' -> {
          popChar = stack.pop();
          if (popChar == '(' || popChar == '[') return false;
        }
        case ']' -> {
          popChar = stack.pop();
          if (popChar == '(' || popChar == '{') return false;
        }
      }
    }
    return (stack.isEmpty());
  }
}
