class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int sum = 0;
        for (int num : nums) sum += num;

        if ((sum + target) % 2 != 0 || Math.abs(target) > sum) return 0;

        int find = (sum + target) / 2;

        int[][] dp = new int[n + 1][find + 1];

        // Base case: one way to make sum 0
        for (int i = 0; i <= n; i++) dp[i][0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= find; j++) {
                if (nums[i - 1] <= j)
                    dp[i][j] = dp[i - 1][j - nums[i - 1]] + dp[i - 1][j];
                else
                    dp[i][j] = dp[i - 1][j];
            }
        }

        return dp[n][find];
    }
}
