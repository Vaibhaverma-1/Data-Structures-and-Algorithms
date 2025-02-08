class Solution {
    public void setZeroes(int[][] matrix) {
        boolean row[] = new boolean[matrix.length];
        boolean col[] = new boolean[matrix[0].length];
        int n = matrix.length;
        for(int i=0; i<n ; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j]==0){
                    row[i] = true;
                    col[j] = true;
                   
                }
            }
        }

        for(int i=0; i<n; i++){
            int m = matrix[i].length;
            for(int j=0; j<m; j++){
                if(row[i]||col[j]){
                    matrix[i][j]=0;
                }
            }
        }
        
    }
}