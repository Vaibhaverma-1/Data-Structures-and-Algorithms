class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        int n =nums.length;
        int left=0;
        for(int i=0;i<n; i++){
            sum+=nums[i];
        }
        for(int i=0; i<n; i++){
            left +=  nums[i];
            if(left-nums[i]==(sum-left)) return i;
        }
        return -1;
    }
}