class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        long sum = 0;
        int l = 0, r = 0;
        long maxSum = Long.MIN_VALUE;

        while (l + k <= n) {
            while (r < n && r - l + 1 <= k) {
                sum += nums[r];
                r++;
            }
            // window size is exactly k
            if (sum > maxSum) maxSum = sum;

            sum -= nums[l];
            l++;
        }
        return (double) maxSum / k;
    }
}
