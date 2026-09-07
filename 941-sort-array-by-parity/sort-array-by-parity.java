class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n= nums.length;
        int i=0,j=n-1;
        while(i<j){
            if(nums[i]%2==0){
                i++;
            }
            if(nums[j]%2!=0){
                j--;
            }
            if(i<j && nums[i]%2!=0 && nums[j]%2==0){
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
            }
        }
        return nums;
    }
}