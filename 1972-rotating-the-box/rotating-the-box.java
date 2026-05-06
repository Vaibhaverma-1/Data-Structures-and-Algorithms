class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int m = boxGrid.length;
        int n = boxGrid[0].length;
        char[][] arr = new char[n][m];

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = boxGrid[m-1-j][i];
            }
        }

        for(int j=0; j<m; j++){
            int empty = n-1;

            for(int i=n-1; i>=0; i--){
                if(arr[i][j]=='*'){
                    empty = i-1;
                }
                else if(arr[i][j]=='#'){
                    arr[i][j]='.';
                    arr[empty][j]='#';
                    empty--;
                }
            }
        }

        return arr;
    }
}