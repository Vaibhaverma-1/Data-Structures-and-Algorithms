
class Solution {
    public int numberOfPaths(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int MOD = 1_000_000_007;

        int[][][] dp = new int[n][m][k];
        dp[0][0][grid[0][0] % k] = 1;
        // First row
        for (int j = 1; j < m; j++) {
            for (int r = 0; r < k; r++) {
                int next = (r + grid[0][j]) % k;
                dp[0][j][next] = dp[0][j-1][r];
            }
        }
        // First column
        for (int i = 1; i < n; i++) {
            for (int r = 0; r < k; r++) {
                int next = (r + grid[i][0]) % k;
                dp[i][0][next] = dp[i-1][0][r];
            }
        }
        // Remaining cells
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                for (int r = 0; r < k; r++) {
                    int next = (r + grid[i][j]) % k;

                    dp[i][j][next] = (int)(
                        ((long) dp[i][j][next]
                        + dp[i-1][j][r]
                        + dp[i][j-1][r]) % MOD
                    );
                }
            }
        }

        return dp[n-1][m-1][0];
    }
}
