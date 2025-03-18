class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxlen = 0;
        int n = nums.length;
        int l = 0, r = 0;
        int zeros = 0;

        while (r < n) {
            if (nums[r] == 0) {
                zeros++;
            }

              if (zeros > k) {
                if (nums[l] == 0) {
                    zeros--;
                }
                l++;  // Move left pointer in all cases
            }

            maxlen = Math.max(r - l + 1, maxlen);
            r++;
        }
        return maxlen;
    }
}
