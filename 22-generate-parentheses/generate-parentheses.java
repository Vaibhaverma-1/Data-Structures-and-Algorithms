import java.util.*;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generate(n, n, "", res);
        return res;
    }

    static void generate(int open, int close, String op, List<String> res) {
  
        if (open == 0 && close == 0) {
            res.add(op);
            return;
        }

        if (open == close) {
            // Only option: add '('
            generate(open - 1, close, op + "(", res);
        } else if (open == 0) {
            // Only option: add ')'
            generate(open, close - 1, op + ")", res);
        } else {
            // Both '(' and ')' are options
            generate(open - 1, close, op + "(", res);
            generate(open, close - 1, op + ")", res);
        }
    }
}
