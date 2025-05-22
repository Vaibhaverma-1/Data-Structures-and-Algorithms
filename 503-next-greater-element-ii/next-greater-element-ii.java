class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        // Traverse the array twice in reverse to simulate circular nature
        for (int i = 2 * n - 1; i >= 0; i--) {
            int current = nums[i % n];

            // Maintain decreasing stack
            while (!st.isEmpty() && st.peek() <= current) {
                st.pop();
            }

            if (i < n) {
                ans[i] = st.isEmpty() ? -1 : st.peek();
            }

            st.push(current);
        }

        return ans;
    }
}
