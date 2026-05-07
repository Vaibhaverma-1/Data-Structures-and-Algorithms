class Solution {
    public int[] maxValue(int[] nums) {

        int n = nums.length;

        int[] max_pre = new int[n];
        int[] min_suff = new int[n];

        max_pre[0] = nums[0];

        for(int i=1; i<n; i++){
            max_pre[i] = Math.max(max_pre[i-1], nums[i]);
        }

        int minSoFar = Integer.MAX_VALUE;

        for(int i=n-1; i>=0; i--){
            minSoFar = Math.min(minSoFar, nums[i]);
            min_suff[i] = minSoFar;
        }

        int[] ans = new int[n];

        ans[n-1] = max_pre[n-1];

        for(int i=n-2; i>=0; i--){

            if(max_pre[i] > min_suff[i+1]){
                ans[i] = ans[i+1];
            }
            else{
                ans[i] = max_pre[i];
            }
        }

        return ans;
    }
}