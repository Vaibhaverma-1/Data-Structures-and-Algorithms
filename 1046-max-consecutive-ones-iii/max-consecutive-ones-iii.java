class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0,j=0,maxLen=0,n=nums.length,count=0;
        while(j<n){
            if(nums[j]==0) count++;
            while(count>k){
                if(nums[i]==0) count--;
                i++;
            }
            maxLen=Math.max(maxLen,j-i+1);
            j++;
        }
        return maxLen;
    }
}