class Solution {
    public int sortPermutation(int[] nums) {
        int n = nums.length;
        int and =-1;
        for(int i=0; i<n; i++){
            if(nums[i]!=i){
                and= and & i;
            }
        }
        return and==-1?0:and;
    }
}