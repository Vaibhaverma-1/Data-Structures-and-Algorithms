class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int current : asteroids) {
            // Process collisions
            while (!stack.isEmpty() && stack.peek() > 0 && current < 0) {
                int top = stack.peek();
                if (Math.abs(current) > top) {
                    stack.pop(); // top explodes, continue checking
                    continue;
                } else if (Math.abs(current) == top) {
                    stack.pop(); // both explode
                }
                current = 0; // current asteroid is destroyed
                break;
            }

            if (current != 0) {
                stack.push(current);
            }
        }

        // Convert stack to array
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }
}
