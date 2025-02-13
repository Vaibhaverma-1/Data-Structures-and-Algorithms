import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        // Step 1: Sort the intervals based on the start value
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();

        for (int[] interval : intervals) {
            // If merged list is empty or current interval does not overlap with the last one
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(interval);
            } else {
                // Merge intervals by updating the end of the last interval
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }

        // Convert List to 2D array
        return merged.toArray(new int[merged.size()][]);
    }
}
