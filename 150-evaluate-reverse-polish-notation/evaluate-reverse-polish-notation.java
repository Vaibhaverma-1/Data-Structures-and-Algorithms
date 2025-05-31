import java.util.*;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (String token : tokens) {
            if (token.equals("+")) {
                int one = st.pop();
                int two = st.pop();
                st.push(two + one);
            } else if (token.equals("-")) {
                int one = st.pop();
                int two = st.pop();
                st.push(two - one);
            } else if (token.equals("*")) {
                int one = st.pop();
                int two = st.pop();
                st.push(two * one);
            } else if (token.equals("/")) {
                int one = st.pop();
                int two = st.pop();
                st.push(two / one);
            } else {
                st.push(Integer.parseInt(token)); // Handles numbers (including negatives)
            }
        }

        return st.pop(); // Final result
    }
}
