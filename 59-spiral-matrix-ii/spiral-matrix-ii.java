class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int top = 0;
        int left = 0;
        int right = n - 1;
        int bottom = n - 1;
        int num = 1;

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                //System.out.print("FO" + num + " ");
                ans[top][i] = num;
                num++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                //System.out.print("FO" + num + " ");
                ans[i][right] = num;
                num++;
            }
            right--;

            for (int i = right; i >= left; i--) {
                //System.out.print("FO" + num + " ");
                ans[bottom][i] = num;
                num++;
            }
            bottom--;

            for (int i = bottom; i >= top; i--) {
                //System.out.print("FO" + num + " ");
                ans[i][left] = num;
                num++;
            }
            left++;
        }
        return ans;
    }
}
