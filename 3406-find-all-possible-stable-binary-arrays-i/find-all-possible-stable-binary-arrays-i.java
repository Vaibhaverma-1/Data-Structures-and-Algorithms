class Solution {

    static final int MOD = 1_000_000_007;

    Integer[][][][] dp;
    int limit;

    public int numberOfStableArrays(int zero, int one, int limit) {

        this.limit = limit;

        dp = new Integer[zero + 1][one + 1][2][limit + 1];

        long ans = 0;

        // Start with placing 0 first
        if (zero > 0) {
            ans += solve(zero - 1, one, 0, 1);
        }

        // Start with placing 1 first
        if (one > 0) {
            ans += solve(zero, one - 1, 1, 1);
        }

        return (int)(ans % MOD);
    }

    long solve(int z, int o, int last, int streak) {

        if (z == 0 && o == 0) return 1;

        if (dp[z][o][last][streak] != null)
            return dp[z][o][last][streak];

        long ways = 0;

        if (last == 0) {

            // place 0 again
            if (z > 0 && streak < limit) {
                ways += solve(z - 1, o, 0, streak + 1);
            }

            // place 1
            if (o > 0) {
                ways += solve(z, o - 1, 1, 1);
            }

        } else { // last == 1

            // place 1 again
            if (o > 0 && streak < limit) {
                ways += solve(z, o - 1, 1, streak + 1);
            }

            // place 0
            if (z > 0) {
                ways += solve(z - 1, o, 0, 1);
            }
        }

        return dp[z][o][last][streak] = (int)(ways % MOD);
    }
}