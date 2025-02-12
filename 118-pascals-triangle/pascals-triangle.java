import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            int ans = 1;
            row.add(ans); 
            for (int j = 1; j <= i; j++) {
                ans = ans * (i - j + 1) / j;
                row.add(ans); 
            }

            list.add(row); 
        }
        
        return list;
    }
}
