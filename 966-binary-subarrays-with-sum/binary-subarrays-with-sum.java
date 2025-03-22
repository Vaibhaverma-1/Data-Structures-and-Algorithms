class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n= nums.length;
        int possible=0;
        for(int i=0; i<n; i++){
            int sum=0;
            for(int j=i; j<n; j++){
                sum+=nums[j];
                if(sum==goal){
                    possible++;
                }
            }
        }
        return possible;
    }
}