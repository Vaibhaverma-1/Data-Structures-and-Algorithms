class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;

        for (int i = 0; i < n; i++) {
            // Primary diagonal
            sum += mat[i][i];
            
            // Secondary diagonal
            if (i != n - 1 - i) { // Avoid double-counting the center for odd-sized matrix
                sum += mat[i][n - 1 - i];
            }
        }

        return sum;
    }
}
