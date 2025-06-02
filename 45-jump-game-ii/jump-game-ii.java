class Solution {
    public int jump(int[] nums) {
        int j=0;
        int l=0;
        int r=0;
        int n  = nums.length;
        while(r<n-1){
            int farthest=0;
         for(int start =l; start<=r; start++){
            farthest = Math.max(farthest, start+nums[start]);
         }
         l=r+1;
         r=farthest;
         j++;
        }
        return j;
        
    }
}