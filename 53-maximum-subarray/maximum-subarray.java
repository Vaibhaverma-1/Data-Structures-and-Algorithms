class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length,best =nums[0],ans=nums[0];
        for(int i=1; i<n; i++){
            int v1 = best+nums[i];
            int v2 = nums[i];
            best = Math.max(v1,v2);
            ans = Math.max(best,ans);
        }
        return ans;
    }
}