import java.util.*;

class Solution {
    public String decodeString(String s) {

        Stack<Integer> numStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        String current = "";
        int num = 0;

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }

            else if (ch == '[') {
                // Store the current number
                numStack.push(num);

                // Store the string built so far
                stringStack.push(current);

                // Start a new string inside []
                num = 0;
                current = "";
            }

            else if (ch == ']') {
                // Get repetition count
                int repeat = numStack.pop();

                // Get string before '['
                String previous = stringStack.pop();

                // Repeat current string
                StringBuilder temp = new StringBuilder(previous);

                for (int i = 0; i < repeat; i++) {
                    temp.append(current);
                }

                current = temp.toString();
            }

            else {
                // Normal character
                current += ch;
            }
        }

        return current;
    }
}