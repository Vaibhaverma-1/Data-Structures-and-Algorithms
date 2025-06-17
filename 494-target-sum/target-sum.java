class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
  

        return solve(nums, 0, target);
    }

    int solve(int[] nums, int index, int target) {
        if (index == nums.length) {
            return target == 0 ? 1 : 0;
        }

        // Try both + and -
        int add = solve(nums, index + 1, target - nums[index]);
        int subtract = solve(nums, index + 1, target + nums[index]);

        return add + subtract;
    }
}
