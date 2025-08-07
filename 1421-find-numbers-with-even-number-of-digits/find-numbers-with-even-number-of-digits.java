class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int count=0;
        for(int num: nums){
            if(digitCount(num)%2==0){
                count++;
            }
        }
        return count;
    }

    int digitCount(int num){
        if(num/10==0) return 1;
        return 1+ digitCount(num/10);
    }

}