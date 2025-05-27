class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if (!st.isEmpty() && st.peek() == s.charAt(i)) {
                st.pop(); // Remove the duplicate
            } else {
                st.push(s.charAt(i)); // Push current character
            }
        }

        // Build final string from stack
        StringBuilder result = new StringBuilder();
        for (char c : st) {
            result.append(c);
        }

        return result.toString();
    }
}
