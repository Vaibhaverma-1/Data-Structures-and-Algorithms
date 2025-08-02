class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length, ans = n;
        for (int i = 0; i < n; i++) ans ^= i ^ nums[i];
        return ans;
    }
}
