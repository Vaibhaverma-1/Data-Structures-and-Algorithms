import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // Fix 1: use Map, not hMap

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                // Fix 2: Use new int[]{...} instead of new int[2](...)
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        return null; // no solution
    }
}
