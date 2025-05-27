class Solution {
    public String removeKdigits(String num, int k) {
        char[] number = num.toCharArray();
        Stack<Character> st = new Stack<>();

        for (char n : number) {
            while (!st.isEmpty() && k > 0 && st.peek() > n) {
                st.pop();
                k--;
            }
            st.push(n);
        }

        // If k > 0, remove the remaining digits from the end
        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }

        // Build the result from the stack
        StringBuilder sb = new StringBuilder();
        for (char c : st) {
            sb.append(c);
        }

        // Remove leading zeros
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}
