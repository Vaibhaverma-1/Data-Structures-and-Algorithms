class Solution {
    public String[] createGrid(int m, int n) {
        String[] ans = new String[m];

        char[] first = new char[n];
        Arrays.fill(first, '.');

        char[] rest = new char[n];
        Arrays.fill(rest, '#');
        rest[n - 1] = '.';

        ans[0] = new String(first);
        String row = new String(rest);

        for (int i = 1; i < m; i++) {
            ans[i] = row;
        }

        return ans;
    }
}