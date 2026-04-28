class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length, curr1=0,curr2=0, minSum=nums[0], maxSum=nums[0], sum=0;;
        for(int i=0; i<n; i++){
            if(curr1>0) curr1=0;
            if(curr2<0) curr2=0;
            sum+=nums[i];
            curr1+=nums[i];
            curr2+=nums[i];
            maxSum=Math.max(maxSum, curr2);
            minSum=Math.min(minSum, curr1);
        }
        if (maxSum < 0) return maxSum;
        return Math.max(sum-minSum, maxSum);
        
    }
}