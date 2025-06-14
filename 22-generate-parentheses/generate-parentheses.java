import java.util.*;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(n, n, new StringBuilder(), res);
        return res;
    }

    private void backtrack(int open, int close, StringBuilder sb, List<String> res) {
        if (open == 0 && close == 0) {
            res.add(sb.toString());
            return;
        }

        if (open > 0) {
            sb.append('(');
            backtrack(open - 1, close, sb, res);
            sb.deleteCharAt(sb.length() - 1);  // backtrack
        }

        if (close > open) {
            sb.append(')');
            backtrack(open, close - 1, sb, res);
            sb.deleteCharAt(sb.length() - 1);  // backtrack
        }
    }
}
