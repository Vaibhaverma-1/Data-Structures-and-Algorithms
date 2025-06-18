class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); // Step 1
        int closestSum = nums[0] + nums[1] + nums[2]; // Initial guess

        for (int i = 0; i < nums.length - 2; i++) { // Step 2
            int left = i + 1, right = nums.length - 1;

            while (left < right) { // Step 3
                int currentSum = nums[i] + nums[left] + nums[right];

                // Update closest sum if needed
                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }

                // Move pointers
                if (currentSum < target) {
                    left++; // Try a bigger sum
                } else if (currentSum > target) {
                    right--; // Try a smaller sum
                } else {
                    return target; // Perfect match
                }
            }
        }

        return closestSum;
    }
}
