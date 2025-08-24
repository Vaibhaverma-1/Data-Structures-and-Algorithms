class Solution {
    public int maxProduct(int[] nums) {
        int maxHere = nums[0], minHere = nums[0], ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int x = nums[i];
            if (x < 0) { int t = maxHere; maxHere = minHere; minHere = t; } // flip roles
            maxHere = Math.max(x, maxHere * x);
            minHere = Math.min(x, minHere * x);
            ans = Math.max(ans, maxHere);
        }
        return ans;
    }
}
