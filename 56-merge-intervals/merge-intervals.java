import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }

        // Sort the intervals based on the start value
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();
        int[] currentInterval = intervals[0];
        merged.add(currentInterval);

        for (int i = 1; i < intervals.length; i++) {
            int[] nextInterval = intervals[i];
            if (currentInterval[1] >= nextInterval[0]) { // Overlapping intervals
                currentInterval = merge(currentInterval, nextInterval); // Use your merge function
                merged.set(merged.size() - 1, currentInterval); // Update the last interval in the list
            } else { // Non-overlapping interval
                currentInterval = nextInterval;
                merged.add(currentInterval);
            }
        }

        // Convert the list to a 2D array
        return merged.toArray(new int[merged.size()][]);
    }

    // Your merge function
    private int[] merge(int[] a, int[] b) {
        if (a[0] == b[0]) {
            if (a[1] >= b[1]) {
                return a;
            } else {
                return b;
            }
        } else {
            if (a[1] >= b[0]) {
                if (a[1] >= b[1]) {
                    return a;
                } else {
                    a[1] = b[1];
                    return a;
                }
            } else {
                return b; // If intervals don't overlap, return the second interval
            }
        }
    }
}