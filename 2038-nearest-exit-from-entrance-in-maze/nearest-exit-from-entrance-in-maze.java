class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        Queue<int[]> q=new ArrayDeque<>();
        q.offer(new int[]{entrance[0],entrance[1]});
        int n=maze.length;
        int m=maze[0].length;
        int steps=0;
        maze[entrance[0]][entrance[1]]='+';

        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                int[] cell=q.poll();
                int row=cell[0];
                int col=cell[1];

                //IF ITS AN EXIT
                if(steps>0 && (row==0||row==n-1||col==0||col==m-1)){
                    return steps;
                }

                //UP
                if(row-1>=0 && maze[row-1][col]=='.'){
                    q.offer(new int[]{row-1,col});
                    maze[row-1][col]='+';
                }
                //DOWN
                if(row+1<n && maze[row+1][col]=='.'){
                    q.offer(new int[]{row+1,col});
                    maze[row+1][col]='+';
                }
                //LEFT
                if(col-1>=0 && maze[row][col-1]=='.'){
                    q.offer(new int[]{row,col-1});
                    maze[row][col-1]='+';
                }
                //RIGHT
                if(col+1<m && maze[row][col+1]=='.'){
                    q.offer(new int[]{row,col+1});
                    maze[row][col+1]='+';
                }
            }
            steps++;
        }
        return -1;
    }
}