class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int left=0;
        double sum=0;
        double ans= (double)Integer.MIN_VALUE;
        for(int right=0; right<n; right++){
              sum+=(double)nums[right];
            while(right-left+1>k){
                sum-=(double)nums[left];
                left++;
            }
            if(right-left+1==k){
                ans = Math.max(ans, sum/k);
            }
        }
        return ans;
    }
}