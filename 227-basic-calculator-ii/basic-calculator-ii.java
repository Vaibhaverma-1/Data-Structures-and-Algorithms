class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int num = 0;
        char sign = '+'; // initial operator

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // build the current number
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }

            // if we hit an operator or end of string, process the previous sign
            if ((!Character.isDigit(ch) && ch != ' ') || i == s.length() - 1) {
                if (sign == '+') {
                    stack.push(num);
                } else if (sign == '-') {
                    stack.push(-num);
                } else if (sign == '*') {
                    stack.push(stack.pop() * num);
                } else if (sign == '/') {
                    stack.push(stack.pop() / num);
                }
                sign = ch;
                num = 0;
            }
        }

        // sum all elements in the stack
        int result = 0;
        for (int n : stack) result += n;
        return result;
    }
}
