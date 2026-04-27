class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0, n = nums.length;
        for(int j=1; j<n; j++){
            if(nums[j]!=nums[i]){
               i++;
               int temp = nums[i];
               nums[i]= nums[j];
               nums[j] = temp;
            }
        }
        return i+1;
    }
}