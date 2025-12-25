class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;

        int[] row = new int[n];
        int[] col = new int[m];

        HashMap<Integer, int[]> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map.put(mat[i][j], new int[]{i, j});
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int[] index = map.get(arr[i]);

            int r = index[0];
            int c = index[1];

            row[r]++;
            col[c]++;

            if (row[r] == m || col[c] == n) {
                return i;
            }
        }

        return -1;
    }
}
