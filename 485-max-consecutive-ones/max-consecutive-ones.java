class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxlen=0;
        int l=0;
        int r=0;
        int n = nums.length;
        while(r<n){
            if(nums[r]==0){
                l=r+1;
            }
            maxlen=Math.max(maxlen, r-l+1);
            r++;
           
        }
        return maxlen;
        
    }
}