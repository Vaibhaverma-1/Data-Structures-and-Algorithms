class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length/2;
        int[] hashset = new int[100001];
        for(int i=0; i<nums.length ; i++){
            hashset[nums[i]]++;
            if(hashset[nums[i]]==n) return nums[i];
        }
        return -1;
    }
}