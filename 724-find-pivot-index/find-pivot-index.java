class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0, n = nums.length;
        for(int i=0; i<n; i++){
            sum+=nums[i];
        }
        int pre=0;
        for(int i=0; i<n; i++){
            pre+=nums[i];
            if(pre-nums[i] == sum-pre){
                return i;
            }

        }
        return -1;
    }
}