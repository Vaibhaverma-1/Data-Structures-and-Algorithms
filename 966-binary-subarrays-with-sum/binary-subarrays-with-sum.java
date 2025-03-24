import java.util.HashMap;

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int cumSum = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // Base case: prefix sum 0 appears once

        for (int r = 0; r < nums.length; r++) {
            cumSum += nums[r];

            if (map.containsKey(cumSum - goal)) {
                count += map.get(cumSum - goal);
            }

            map.put(cumSum, map.getOrDefault(cumSum, 0) + 1);
        }

        return count;
    }
}
