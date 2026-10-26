class Solution {

    public int countIslands(int[][] grid, int k) {
        int count=0;
        int n = grid.length;
        int m = grid[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j]!=0){
                    if(bfs(grid,k,i,j,n,m,0L)){
                        count++;
                    }
                }
            }
        }
        return count;

    }

    public boolean bfs(int[][] grid, int k, int r, int c, int n, int m, long sum){
        Queue<int[]> q = new ArrayDeque<>();
        sum+=grid[r][c];
        grid[r][c]=0;
        q.offer(new int[]{r,c});
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int row = curr[0];
            int col = curr[1];
            //up
            int up = row-1;
            if(up>=0 && grid[up][col]!=0){
                sum+=grid[up][col];
                grid[up][col]=0;
                q.offer(new int[]{up,col});
            }
            //down
            int down = row+1;
            if(down<n && grid[down][col]!=0){
                sum+=grid[down][col];
                grid[down][col]=0;
                q.offer(new int[]{down,col});
            }
            //left
            int left = col-1;
            if(left>=0 && grid[row][left]!=0){
                sum+=grid[row][left];
                grid[row][left]=0;
                q.offer(new int[]{row,left});
            }
            int right = col+1;
            if(right<m && grid[row][right]!=0){
                sum+=grid[row][right];
                grid[row][right]=0;
                q.offer(new int[]{row,right});
            }

        }
        return sum%k==0?true:false;

    }
}