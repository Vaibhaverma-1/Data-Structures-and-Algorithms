class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int[] ans = new int[n];
        int pre=1, post=1;
        ans[0]=pre;
        for(int i=1; i<n; i++){
            pre*=nums[i-1];
            ans[i]=pre;
        }
        ans[n-1]*= post;
        for(int i=n-2; i>=0; i--){
            post*=nums[i+1];
            ans[i]*=post;
        }
        return ans;

    }
}