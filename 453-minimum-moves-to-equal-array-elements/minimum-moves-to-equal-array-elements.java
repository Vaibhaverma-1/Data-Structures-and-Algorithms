class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length, moves=0, min = Integer.MAX_VALUE, sum=0;
        for(int num:nums){
            min=Math.min(min,num);
            sum+=num;
        }
      
        return sum-(n*min);
    }

}