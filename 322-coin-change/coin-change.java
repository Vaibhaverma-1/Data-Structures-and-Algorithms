class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n + 1][amount + 1];

        // Fill DP with -1 (unvisited)
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= amount; j++) {
                dp[i][j] = -1;
            }
        }

        int ans = solve(coins, 0, amount, dp);
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    int solve(int[] coins, int i, int amount, int[][] dp) {
        if (amount == 0) return 0;
        if (amount < 0 || i >= coins.length) return Integer.MAX_VALUE;

        if (dp[i][amount] != -1) return dp[i][amount];

        // include current coin (stay at i)
        int include = solve(coins, i, amount - coins[i], dp);
        if (include != Integer.MAX_VALUE) include += 1;

        // exclude current coin (move to i + 1)
        int exclude = solve(coins, i + 1, amount, dp);

        return dp[i][amount] = Math.min(include, exclude);
    }
}
