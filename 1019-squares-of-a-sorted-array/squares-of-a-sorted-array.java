class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int i=0,k=n-1,j=n-1;
        while(i<=j){
            int left = nums[i]*nums[i];
            int right = nums[j]*nums[j];
            if(left<=right){
                ans[k]=right;
                j--;
            }
            else{
                ans[k]=left;
                i++;
            }
            k--;
        }
        return ans;
    }
}