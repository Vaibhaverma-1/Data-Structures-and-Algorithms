class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        // Step 1: Convert to list and add new interval
        List<int[]> list = new ArrayList<>(Arrays.asList(intervals));
        list.add(newInterval);

        // Step 2: Sort based on start time
        Collections.sort(list, (a, b) -> Integer.compare(a[0], b[0]));

        // Step 3: Merge intervals
        List<int[]> merged = new ArrayList<>();
        for (int[] interval : list) {
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(interval);
            } else {
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }

        // Step 4: Convert List<int[]> to int[][]
        return merged.toArray(new int[merged.size()][]);
    }
}
