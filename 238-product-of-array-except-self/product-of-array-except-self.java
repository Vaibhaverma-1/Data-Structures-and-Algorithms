class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] pref = new int[n];
        int[] suff = new int[n];
        int[] ans  = new int[n];

        // prefix: product of elements to the left of i
        pref[0] = 1;
        for (int i = 1; i < n; i++) {
            pref[i] = pref[i - 1] * nums[i - 1];
        }

        // suffix: product of elements to the right of i
        suff[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            suff[i] = suff[i + 1] * nums[i + 1];
        }

        // answer: left * right
        for (int i = 0; i < n; i++) {
            ans[i] = pref[i] * suff[i];
        }
        return ans;
    }
}
