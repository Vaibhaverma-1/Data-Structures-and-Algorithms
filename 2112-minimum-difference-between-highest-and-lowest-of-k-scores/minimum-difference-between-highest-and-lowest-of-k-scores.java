import java.util.Arrays;

class Solution {
    public int minimumDifference(int[] nums, int k) {
        if (k <= 1) return 0;

        Arrays.sort(nums);                  
        int n = nums.length;
        int l = 0, r = 0;
        int ans = Integer.MAX_VALUE;

        while (l + k <= n) {
            
            while (r < n && r - l + 1 <= k) {
                r++;
            }
     
            int diff = nums[r - 1] - nums[l];
            if (diff < ans) ans = diff;

         
            l++;
        }
        return ans;
    }
}
