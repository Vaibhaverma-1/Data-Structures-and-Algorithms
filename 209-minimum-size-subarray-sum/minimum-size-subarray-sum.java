class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int i=0,j=0,minlen=Integer.MAX_VALUE,sum=0;
        while(j<n){
          sum+=nums[j];
          while(sum>=target){
            minlen = Math.min(minlen,j-i+1);
            sum-=nums[i];
            i++;
          }
          j++;
        }
        return minlen==Integer.MAX_VALUE?0:minlen;
    }
}