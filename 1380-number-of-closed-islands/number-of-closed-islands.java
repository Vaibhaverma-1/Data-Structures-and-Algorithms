class Solution {
    public int closedIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean isClosed = true;
        int count=0;
        for(int i=1;i<n-1;i++){
            for(int j=1; j<m-1; j++){
                if(grid[i][j]==0 && bfs(grid,i,j,n,m)){
                    count++;
                }
            }
        }
        return count;
    }
    boolean bfs(int[][] grid, int r, int c, int n, int m ){
        Queue <int[]> q = new ArrayDeque<>();
        boolean isClosed = true;
        grid[r][c]=1;
        q.offer(new int[]{r,c});
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int row = curr[0];
            int col = curr[1];
            if(row==0||col==0||row==n-1||col==m-1){
                isClosed = false;
            }
            //check for all adjacent cells
            //up
            
            int up = row-1;
            if(up>=0 && grid[up][col]==0){
                grid[up][col]=1;
                q.offer(new int[]{up,col});
            }
            //down
            int down = row+1;
            if(down<=n-1 && grid[down][col]==0){
                grid[down][col]=1;
                q.offer(new int[]{down,col});
            }
            //left
            int left = col-1;
            if(left>=0 && grid[row][left]==0){
                grid[row][left]=1;
                q.offer(new int[]{row,left});
            }
            //right
            int right = col+1;
            if(right<=m-1 && grid[row][right]==0){
                grid[row][right]=1;
                q.offer(new int[]{row,right});
            }
        }
        return isClosed;

    }
    //find all 0 groups
    //dont count the groups with 0 at borders
}