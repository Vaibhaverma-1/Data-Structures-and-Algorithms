class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        int xor=0;
        int zero=0;
        for(int i=0; i<n; i++){
           xor^=nums[i];
           if(nums[i]==0){
            zero++;
           }
        }
        if(zero==n){
            return 0;
        }
        if(xor==0){
            return n-1;
        }
        return n;


    }
}