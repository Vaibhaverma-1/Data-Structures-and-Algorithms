class Solution {
    public int minCost(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][][] ans = new boolean[n][m][1024];
        int xor=0;
        for(int i=0;i<m; i++){
            xor^=grid[0][i];
            ans[0][i][xor]=true;
        }
        xor=0;
        for(int i=0; i<n; i++){
            xor^=grid[i][0];
            ans[i][0][xor]=true;
        }
        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                for(int k=0; k<=1023; k++){
                    if(ans[i-1][j][k]){
                        ans[i][j][k^grid[i][j]]=true;
                    }
                    if(ans[i][j-1][k]){
                        ans[i][j][k^grid[i][j]]=true;
                    }

                }
            }
        }

        for(int i=0; i<=1023;i++){
            if(ans[n-1][m-1][i]){
                return i;
            }
        }
        return -1;


    }
}