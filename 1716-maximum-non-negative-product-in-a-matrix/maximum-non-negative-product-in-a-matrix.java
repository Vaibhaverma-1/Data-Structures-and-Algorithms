
class Solution {
    public int maxProductPath(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        long[][] minDp=new long[n][m];
        long[][] maxDp=new long[n][m];

        minDp[0][0]=grid[0][0];
        maxDp[0][0]=grid[0][0];

        for(int i=1;i<n;i++){
            minDp[i][0]=minDp[i-1][0]*grid[i][0];
            maxDp[i][0]=maxDp[i-1][0]*grid[i][0];
        }

        for(int j=1;j<m;j++){
            minDp[0][j]=minDp[0][j-1]*grid[0][j];
            maxDp[0][j]=maxDp[0][j-1]*grid[0][j];
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                long val=grid[i][j];

                long a=minDp[i-1][j]*val;
                long b=maxDp[i-1][j]*val;
                long c=minDp[i][j-1]*val;
                long d=maxDp[i][j-1]*val;

                minDp[i][j]=Math.min(Math.min(a,b),Math.min(c,d));
                maxDp[i][j]=Math.max(Math.max(a,b),Math.max(c,d));
            }
        }

        long ans=maxDp[n-1][m-1];
        if(ans<0) return -1;
        return (int)(ans%1000000007);
    }
}
