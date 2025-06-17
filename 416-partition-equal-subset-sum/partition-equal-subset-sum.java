class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }


        if (totalSum % 2 != 0) return false;

        int target = totalSum / 2;

        boolean[][] dp = new boolean[n + 1][target + 1];

       
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i <= n; i++) {
            for (int sum = 1; sum <= target; sum++) {
                if (nums[i - 1] <= sum) {
                    
                    dp[i][sum] = dp[i - 1][sum] || dp[i - 1][sum - nums[i - 1]];
                } else {
                    
                    dp[i][sum] = dp[i - 1][sum];
                }
            }
        }

        return dp[n][target];
    }
}
