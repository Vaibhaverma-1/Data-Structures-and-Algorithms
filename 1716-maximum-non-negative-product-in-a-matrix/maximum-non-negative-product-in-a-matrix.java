
class Solution {
    public int maxProductPath(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        long[][][] dp=new long[n][m][2];

        dp[0][0][0]=grid[0][0];
        dp[0][0][1]=grid[0][0];

        for(int i=1;i<n;i++){
            dp[i][0][0]=dp[i-1][0][0]*grid[i][0];
            dp[i][0][1]=dp[i][0][0];
        }

        for(int j=1;j<m;j++){
            dp[0][j][0]=dp[0][j-1][0]*grid[0][j];
            dp[0][j][1]=dp[0][j][0];
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                long val=grid[i][j];

                long a=dp[i-1][j][0]*val;
                long b=dp[i-1][j][1]*val;
                long c=dp[i][j-1][0]*val;
                long d=dp[i][j-1][1]*val;

                dp[i][j][0]=Math.min(Math.min(a,b),Math.min(c,d));
                dp[i][j][1]=Math.max(Math.max(a,b),Math.max(c,d));
            }
        }

        long ans=dp[n-1][m-1][1];
        if(ans<0) return -1;
        return (int)(ans%1000000007);
    }
}
