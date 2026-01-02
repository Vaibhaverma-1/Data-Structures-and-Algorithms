import java.util.*;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) return new ArrayList<>(Arrays.asList(1));

        List<Long> longRow = generate(rowIndex + 1);
        List<Integer> intRow = new ArrayList<>();
        for (long val : longRow) {
            intRow.add((int) val);
        }
        return intRow;
    }

    public List<Long> generate(int numRows) {
        List<List<Long>> list = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Long> row = new ArrayList<>();
            long ans = 1;
            row.add(ans);

            for (int j = 1; j <= i; j++) {
                ans = ans * (i - j + 1L) / j;
                row.add(ans);
            }

            list.add(row);
        }

        return list.get(numRows - 1);
    }
}
