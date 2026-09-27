class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int best =nums[0],ans=nums[0],worst=nums[0];
        for(int i=1; i<n; i++){
            int v1 = nums[i]*best;
            int v2 = nums[i];
            int v3 = nums[i]*worst;
            worst = Math.min(v1,Math.min(v2,v3));
            best = Math.max(v1,Math.max(v2,v3));
            ans = Math.max(ans,best);
        }
        return ans;
    }
}