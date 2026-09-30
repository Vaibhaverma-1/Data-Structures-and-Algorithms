class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int i=0,j=0,n=nums.length;
        int sum=0;
        int count=0;
        int zeros=0;
        while(j<n){
           if(nums[j]==1) sum++;
           while(sum>goal && i<j)
           {
            zeros=0;
            if(nums[i]==1) sum--;
            i++;
            }

           if(sum==goal){
            while(i<j && nums[i]==0){
                zeros++;
                i++;
            }
            count+=zeros+1;
           }
           j++;
        }
        return count;
    }
}