class Solution {
    public long countSubarrays(int[] nums, int k) {
        int n = nums.length;
        int freq=0;
        long count=0L;
        int max=Integer.MIN_VALUE;
        for(int num:nums){
            if(num>max){
                max=num;
                
            }
        }
        int i=0,j=0;
        while(j<n){
            if(nums[j]==max){
                freq++;
            }
            while(freq>=k){
                count+=(long)n-j;
                if(nums[i]==max){
                    freq--;
                }
                i++;
                
            }
            
                j++;
            
        }
        return count;
    }
}