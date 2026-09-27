class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int best = 0, worst = 0, ans = 0;
        for(int x : nums){
            best = Math.max(0, best + x);
            worst = Math.min(0, worst + x);
            ans = Math.max(ans, Math.max(best, -worst));
        }
        return ans;
    }
}