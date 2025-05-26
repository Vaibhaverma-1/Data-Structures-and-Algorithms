// Second Attempt: Two Pointer Optimized Approach
// Time Complexity: O(n), Space Complexity: O(1)

class Solution {
    public int trap(int[] height) {
        int length = height.length;

        // Two pointers starting from left and right ends
        int left = 0;
        int right = length - 1;

        // Track maximum height seen so far from left and right
        int leftMax = 0;
        int rightMax = 0;

        int totalWaterTrapped = 0;

        while (left < right) {
            if (height[left] <= height[right]) {
                // If current height is less than max on left, water can be trapped
                if (height[left] < leftMax) {
                    totalWaterTrapped += leftMax - height[left];
                } else {
                    leftMax = height[left];
                }
                left++;
            } else {
                // If current height is less than max on right, water can be trapped
                if (height[right] < rightMax) {
                    totalWaterTrapped += rightMax - height[right];
                } else {
                    rightMax = height[right];
                }
                right--;
            }
        }

        return totalWaterTrapped;
    }
}


/*
First Attempt: Prefix-Suffix Approach
Time Complexity: O(n), Space Complexity: O(n)

class Solution {
    public int trap(int[] height) {
        int n = height.length;

        // Suffix max array to store max height to the right of each bar
        int[] suffixMax = new int[n];
        suffixMax[n - 1] = height[n - 1];

        // Build suffix max array from right to left
        for (int i = n - 2; i >= 0; i--) {
            suffixMax[i] = Math.max(suffixMax[i + 1], height[i]);
        }

        int totalWater = 0;
        int leftMax = height[0];

        // Traverse from left to right (excluding the first bar)
        for (int i = 1; i < n; i++) {
            leftMax = Math.max(leftMax, height[i - 1]);  // max height to the left
            int rightMax = suffixMax[i];                // max height to the right

            // Water is trapped only if both sides are taller
            if (height[i] < leftMax && height[i] < rightMax) {
                totalWater += Math.min(leftMax, rightMax) - height[i];
            }
        }

        return totalWater;
    }
}
*/
