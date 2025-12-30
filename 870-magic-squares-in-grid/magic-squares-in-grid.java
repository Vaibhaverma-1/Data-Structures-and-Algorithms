class Solution {
    public int numMagicSquaresInside(int[][] grid) {

        int row = grid.length;
        int col = grid[0].length;
        int count = 0;

        for (int i = 0; i <= row - 3; i++) {
            for (int j = 0; j <= col - 3; j++) {

                if (grid[i + 1][j + 1] != 5) continue;

                HashSet<Integer> set = new HashSet<>();

                int r1 = 0, r2 = 0, r3 = 0;
                int c1 = 0, c2 = 0, c3 = 0;
                int d1 = 0, d2 = 0;

                boolean invalid = false;

                for (int r = i; r < i + 3; r++) {
                    for (int c = j; c < j + 3; c++) {

                        int val = grid[r][c];

                        if (val < 1 || val > 9 || set.contains(val)) {
                            invalid = true;
                            break;
                        }

                        set.add(val);

                        if (r == i) r1 += val;
                        else if (r == i + 1) r2 += val;
                        else r3 += val;

                        if (c == j) c1 += val;
                        else if (c == j + 1) c2 += val;
                        else c3 += val;

                        if (r - i == c - j) d1 += val;
                        if (r - i + c - j == 2) d2 += val;
                    }
                    if (invalid) break;
                }

                if (invalid) continue;

                if (r1 == 15 && r2 == 15 && r3 == 15 &&
                    c1 == 15 && c2 == 15 && c3 == 15 &&
                    d1 == 15 && d2 == 15) {
                    count++;
                }
            }
        }
        return count;
    }
}
