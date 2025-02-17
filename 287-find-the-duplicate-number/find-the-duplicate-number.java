class Solution {
    public int findDuplicate(int[] nums) {
        int e= findMax(nums);
        int hashset[] = new int[e+1];
        for(int i=0; i<nums.length; i++){
            hashset[nums[i]]++;
        }

        for(int i=0; i<nums.length; i++){
            if(hashset[nums[i]]>=2){
                return nums[i];
            }
        }
         return -1;
    }
    int findMax(int[] nums){
        int max=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>=max){
                max=nums[i];
            }
        }
        return max;
    }

   
}