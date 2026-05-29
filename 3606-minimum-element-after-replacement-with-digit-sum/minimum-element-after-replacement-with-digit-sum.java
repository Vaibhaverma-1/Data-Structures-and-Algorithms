class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        int n = nums.length;
        for(int i=0; i<n; i++){
            int temp = nums[i];
            int sum=0;
            while(temp != 0){
                sum += temp % 10;
                temp = temp/10;
            }
            min = Math.min(min, sum);
        }
        return min;
    }
}