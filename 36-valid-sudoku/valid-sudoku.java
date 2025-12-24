class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashMap<Integer, HashSet<Character>> rows = new HashMap<>();
        HashMap<Integer, HashSet<Character>> cols = new HashMap<>();
        HashMap<Integer, HashSet<Character>> boxes = new HashMap<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                char c = board[i][j];
                if (c == '.') continue;

                // Row check
                rows.putIfAbsent(i, new HashSet<>());
                if (rows.get(i).contains(c)) return false;
                rows.get(i).add(c);

                // Column check
                cols.putIfAbsent(j, new HashSet<>());
                if (cols.get(j).contains(c)) return false;
                cols.get(j).add(c);

                // Box check
                int boxKey = (i / 3) * 3 + (j / 3);
                boxes.putIfAbsent(boxKey, new HashSet<>());
                if (boxes.get(boxKey).contains(c)) return false;
                boxes.get(boxKey).add(c);
            }
        }

        return true;
    }
}
