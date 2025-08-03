class Solution {
    public int numOfSubarrays(int[] nums, int k, int threshold) {
        int count=0;
        int th = threshold*k;
        int n = nums.length;
        int sum=0;
        int l=0,r=0;
        while(l+k<=n){
            while(r<n && r-l+1<=k){
                sum+=nums[r];
                r++;
            }
            if(sum>= th) count++;
            sum-=nums[l];
            l++;
        }
        return count;
    }
}