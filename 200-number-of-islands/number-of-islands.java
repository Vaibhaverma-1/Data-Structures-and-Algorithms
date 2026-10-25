class Solution {
    public int numIslands(char[][] grid) {
        int islands=0;
        int n = grid.length;
        int m = grid[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j]=='1'){
                    islands++;
                    dfs(grid,i,j,n,m);
                }
            }
        }
        return islands;
        
    }

    void dfs(char[][] arr, int r, int c, int n, int m){
            Queue<int[]> q = new ArrayDeque<>();
            arr[r][c]='0';
            q.offer(new int[]{r,c});
            while(!q.isEmpty()){
                int[] curr = q.poll();
                int row = curr[0];
                int col = curr[1];
                //process all 4 directions
                //up
                int up = row-1;
                if(up>=0 && arr[up][col]=='1'){
                    arr[up][col]='0';
                    q.offer(new int[]{up,col});
                }
                //down
                int down = row+1;
                if(down<n && arr[down][col]=='1'){
                    arr[down][col]='0';
                    q.offer(new int[]{down,col});
                }
                //left
                int left = col-1;
                if(left>=0 && arr[row][left]=='1'){
                    arr[row][left]='0';
                    q.offer(new int[]{row,left});
                }
                //right
                int right = col+1;
                if(right<m && arr[row][right]=='1'){
                    arr[row][right]='0';
                    q.offer(new int[]{row,right});
                }
            }
    }
    
}