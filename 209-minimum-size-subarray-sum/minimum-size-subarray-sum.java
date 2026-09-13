class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int high =0,low=0,n=nums.length,minlen=Integer.MAX_VALUE,sum=0;
        while(high<n){
           sum+=nums[high];
           while(sum>=target){
            minlen=Math.min(minlen,high-low+1);
            sum-=nums[low];
            low++;
           }
           high++;
        }
        return minlen==Integer.MAX_VALUE?0:minlen;
    }
}