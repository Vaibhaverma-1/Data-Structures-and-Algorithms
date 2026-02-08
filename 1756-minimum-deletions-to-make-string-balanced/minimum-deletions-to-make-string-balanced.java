class Solution {
    public int minimumDeletions(String s) {
        int n = s.length();
        int count = 0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            if (!stack.isEmpty() && stack.peek() == 'b' && s.charAt(i) == 'a') {
                count++;
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        return count;
    }
}
