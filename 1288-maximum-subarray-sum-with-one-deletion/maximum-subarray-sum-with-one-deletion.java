class Solution {
    public int maximumSum(int[] arr) {
        int n = arr.length, ans = arr[0], best = arr[0], delete = 0;
        for(int i=1; i<n; i++){
            delete= Math.max(best,arr[i]+delete);
            best = Math.max(best+arr[i],arr[i]);
            
            ans= Math.max(best,Math.max(ans,delete));
        }
        return ans;
    }
}