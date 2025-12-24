class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                char value = board[i][j];
                if (value == '.') continue;

                if (!rows[i].add(value)) return false;
                if (!cols[j].add(value)) return false;

                int boxKey = (i / 3) * 3 + (j / 3);
                if (!boxes[boxKey].add(value)) return false;
            }
        }

        return true;
    }
}
