class Solution {
    public int minMoves(int[] nums) {
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i=0; i<n; i++){
            max = Math.max(max,nums[i]);
        }
        int count=0;
        for(int i=0; i<n; i++){
            count+=max-nums[i];
        }
        return count;
        
    }
}