class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n=nums.length,min=nums[0],best=nums[0],worst=nums[0],max=nums[0];
        for(int i=1; i<n; i++){
              best = Math.max(nums[i],nums[i]+best);
              worst = Math.min(nums[i],worst+nums[i]);
              min = Math.min(min,worst);
              max = Math.max(best,max);
        }
        return Math.abs(min)>max?Math.abs(min):max;
    }
}