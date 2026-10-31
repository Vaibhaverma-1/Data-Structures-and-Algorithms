
class Solution {
    public int numTilings(int n) {
        int MOD = 1_000_000_007;

        if (n <= 2) {
            return n;
        }

        long[] dp = new long[n + 1];

        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = (2 * dp[i - 1] + dp[i - 3]) % MOD;
        }

        return (int) dp[n];
    }
}
