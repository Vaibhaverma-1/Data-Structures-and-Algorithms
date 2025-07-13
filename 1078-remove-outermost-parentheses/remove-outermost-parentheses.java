class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        StringBuilder result = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < n; i++) {
            // If the stack is empty, it means a primitive is complete
            // So we append the last primitive's inner part to result
            if (st.isEmpty()) {
                result.append(temp); // add the previous temp (inner part)
                temp = new StringBuilder(); // reset temp for next primitive
            }

            if (s.charAt(i) == '(') {
                st.push('(');
                // Avoid appending the outermost '('
                if (st.size() > 1) {
                    temp.append('('); // only append if it's not the first '('
                }
            } else {
                st.pop();
                // Avoid appending the outermost ')'
                if (!st.isEmpty()) {
                    temp.append(')');
                }
            }
        }

        
        result.append(temp);
        return result.toString();
    }
}
