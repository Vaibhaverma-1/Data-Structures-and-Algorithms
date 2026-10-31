
class Solution {
    int[][] dp;

    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();

        dp = new int[n][m];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return dfs(0, 0, text1, text2);
    }

    public int dfs(int i, int j, String a, String b) {
        if (i == a.length() || j == b.length()) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        if (a.charAt(i) == b.charAt(j)) {
            return dp[i][j] = 1 + dfs(i + 1, j + 1, a, b);
        }

        int skipA = dfs(i + 1, j, a, b);
        int skipB = dfs(i, j + 1, a, b);

        return dp[i][j] = Math.max(skipA, skipB);
    }
}
