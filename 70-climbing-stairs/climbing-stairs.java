class Solution {
    public int climbStairs(int n) {
       int[] dp = new int[n + 2];   // indices: 0..n+1
dp[n]   = 1;                 // base
dp[n+1] = 0;                 // base
for (int i = n - 1; i >= 0; i--) {
    dp[i] = dp[i + 1] + dp[i + 2];   // max access is i = n-1 → n, n+1 (in-bounds)
}
return dp[0];

    }
    
}