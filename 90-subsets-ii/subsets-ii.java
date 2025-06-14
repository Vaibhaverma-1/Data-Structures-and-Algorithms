class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
       Arrays.sort(nums);
         List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        generateSubsets(nums, 0, current, result);
        return result;
        
    }

      private void generateSubsets(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {
   if (index == nums.length) {
    if (!result.contains(new ArrayList<>(current))) {
        result.add(new ArrayList<>(current));
    }
    return;
}


        // Include the current element
        current.add(nums[index]);
        generateSubsets(nums, index + 1, current, result);
        current.remove(current.size() - 1);  // backtrack

        // Exclude the current element
        generateSubsets(nums, index + 1, current, result);
    }
}