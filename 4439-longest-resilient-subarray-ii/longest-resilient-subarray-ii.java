class Solution {
    public int resilientSubarray(int[] nums, int k) {
        int i=0,j=0,n=nums.length;
        int maxLen = 1;
        while(i<n){
            int rem = nums[i]%k;
            j=i;
            while(j<n && nums[j]%k==rem){
                j++;
            }
            int len = j-i;
            while(((len-1)*rem)%k!=0){
                len--;
            }
            maxLen = Math.max(maxLen,len);
            i=j;
        }
        return maxLen;
    }
}