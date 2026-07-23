class Solution {
    public void gameOfLife(int[][] board) {
        int n=board.length,m=board[0].length;
        int[][] arr=new int[n][m];

        int[] dr={-1,-1,-1,0,0,1,1,1};
        int[] dc={-1,0,1,-1,1,-1,0,1};

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                for(int k=0;k<8;k++){
                    int nr=i+dr[k];
                    int nc=j+dc[k];
                    if(nr>=0 && nr<n && nc>=0 && nc<m && board[nr][nc]==1)
                        arr[i][j]++;
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==1){
                    if(arr[i][j]<2) board[i][j]=0;
                    else if(arr[i][j]<=3) board[i][j]=1;
                    else board[i][j]=0;
                }
                else{
                    if(arr[i][j]==3) board[i][j]=1;
                }
            }
        }
    }
}