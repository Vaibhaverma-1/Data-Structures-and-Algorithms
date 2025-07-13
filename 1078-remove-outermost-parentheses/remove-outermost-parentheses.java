class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        StringBuilder currentPrimitive = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            // If the stack is empty, we just finished a primitive
            if (stack.isEmpty()) {
                result.append(currentPrimitive); // append the previous primitive's inner content
                currentPrimitive.setLength(0);   // reset for the next primitive
            }

            if (ch == '(') {
                stack.push(ch);
                if (stack.size() > 1) {
                    currentPrimitive.append(ch); // not the outermost '('
                }
            } else { // ch == ')'
                stack.pop();
                if (!stack.isEmpty()) {
                    currentPrimitive.append(ch); // not the outermost ')'
                }
            }
        }

        // Append the last primitive's inner content (if any)
        result.append(currentPrimitive);
        return result.toString();
    }
}
