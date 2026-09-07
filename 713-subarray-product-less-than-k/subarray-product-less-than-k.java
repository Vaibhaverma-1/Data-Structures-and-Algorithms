class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0;
        int i=0, n= nums.length,j=0,prod=1;
        while(i<n && j<n){
            prod=prod*nums[i];
           
            while(prod>=k && j<n){
                prod = prod/nums[j];
                j++;
                
            }
             if(prod<k){
                count+=(i-j+1);
            }
            i++;
        }
        return count;
    }
}