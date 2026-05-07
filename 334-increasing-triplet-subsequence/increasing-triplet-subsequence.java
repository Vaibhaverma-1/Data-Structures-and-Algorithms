class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        int first=Integer.MAX_VALUE,second=Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(nums[i]<=first){
                first= nums[i];
            }
            else if(nums[i]<=second){
                second = nums[i];
            }
            else{
                return true;
            }
        }
        return false;
    }
}