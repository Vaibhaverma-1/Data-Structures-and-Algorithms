class Solution {
    public int lastStoneWeightII(int[] stones) {
        int n = stones.length;
        int total = 0;
        for (int stone : stones) total += stone;

        // Initialize dp table: size [n][total+1], fill with -1
        int[][] dp = new int[n][total + 1];
        for (int[] row : dp) Arrays.fill(row, -1);

        return helper(n - 1, 0, stones, total, dp);
    }

    private int helper(int index, int s1, int[] stones, int total, int[][] dp) {
        if (index < 0) {
            int s2 = total - s1;
            return Math.abs(s1 - s2);
        }

        if (dp[index][s1] != -1) return dp[index][s1];

        // Option 1: Put stone in s1
        int include = helper(index - 1, s1 + stones[index], stones, total, dp);

        // Option 2: Put stone in s2
        int exclude = helper(index - 1, s1, stones, total, dp);

        return dp[index][s1] = Math.min(include, exclude);
    }
}
