class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        HashSet<Integer> row = new HashSet<>();
        HashSet<Integer> col = new HashSet<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
               if(row.contains(matrix[i][j])|| col.contains(matrix[j][i])) return false;

               row.add(matrix[i][j]);
               col.add(matrix[j][i]);
            }
            
            System.out.print("Row"+i+row);
            System.out.print("Column"+i+col);
            
            if(!row.contains(i+1)|| !col.contains(i+1)) return false;
            row.clear();
            col.clear();
        }
        return true;
    }
}