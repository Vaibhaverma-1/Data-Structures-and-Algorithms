class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int i=0,j=0,n=nums.length;
        int sum=0;
        int count=0;
        while(j<n){
           if(nums[j]==1) sum++;
           while(sum>goal && i<j)
           {
            if(nums[i]==1) sum--;
            i++;
            }

           if(sum==goal){
            int temp =i;
            while(temp<j && nums[temp]!=1){
                temp++;
                count++;
            }
            count++;
           }
           j++;
        }
        return count;
    }
}