import java.util.*;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);  // Step 1: sort the array
        List<List<Integer>> result = new ArrayList<>();
        generate(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private void generate(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {
        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Include nums[index]
        current.add(nums[index]);
        generate(nums, index + 1, current, result);
        current.remove(current.size() - 1);  // backtrack

        // Skip all duplicates of current element before exclusion
        while (index + 1 < nums.length && nums[index] == nums[index + 1]) {
            index++;
        }

        // Exclude nums[index]
        generate(nums, index + 1, current, result);
    }
}
