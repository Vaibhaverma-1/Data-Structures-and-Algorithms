import java.util.*;

class Solution {
    public List<String> removeInvalidParentheses(String s) {
        int leftRem = 0, rightRem = 0;

        // First pass to calculate number of extra '(' and ')'
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                leftRem++;
            } else if (ch == ')') {
                if (leftRem > 0) leftRem--;
                else rightRem++;
            }
        }

        Set<String> result = new HashSet<>();
        backtrack(s, 0, 0, leftRem, rightRem, new StringBuilder(), result);
        return new ArrayList<>(result);
    }

    private void backtrack(String s, int index, int balance, int leftRem, int rightRem,
                           StringBuilder path, Set<String> result) {
        if (index == s.length()) {
            if (balance == 0 && leftRem == 0 && rightRem == 0) {
                result.add(path.toString());
            }
            return;
        }

        char ch = s.charAt(index);
        int len = path.length();

        if (ch == '(') {
            // Option 1: Remove it
            if (leftRem > 0) {
                backtrack(s, index + 1, balance, leftRem - 1, rightRem, path, result);
            }

            // Option 2: Keep it
            path.append(ch);
            backtrack(s, index + 1, balance + 1, leftRem, rightRem, path, result);
            path.deleteCharAt(len);
        }

        else if (ch == ')') {
            // Option 1: Remove it
            if (rightRem > 0) {
                backtrack(s, index + 1, balance, leftRem, rightRem - 1, path, result);
            }

            // Option 2: Keep it, only if balance > 0
            if (balance > 0) {
                path.append(ch);
                backtrack(s, index + 1, balance - 1, leftRem, rightRem, path, result);
                path.deleteCharAt(len);
            }
        }

        else {
            // Neutral letter
            path.append(ch);
            backtrack(s, index + 1, balance, leftRem, rightRem, path, result);
            path.deleteCharAt(len);
        }
    }
}
