class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n + 1][amount + 1];
        int INF = Integer.MAX_VALUE - 1;  // To avoid overflow on +1

        // Initialize
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;  // 0 amount needs 0 coins
        }
        for (int j = 1; j <= amount; j++) {
            dp[0][j] = INF;  // 0 coins can't make any positive amount
        }

        // Fill 1st row separately (only 1st coin allowed)
        for (int j = 1; j <= amount; j++) {
            if (j % coins[0] == 0)
                dp[1][j] = j / coins[0];
            else
                dp[1][j] = INF;
        }

        // DP recurrence
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= amount; j++) {
                if (coins[i - 1] <= j) {
                    dp[i][j] = Math.min(dp[i][j - coins[i - 1]] + 1, dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][amount] >= INF ? -1 : dp[n][amount];
    }
}
