class Solution {
    public int majorityElement(int[] nums) {
        int ele=nums[0];
        int n = nums.length;
        int vote=0;
        for(int i=0; i<n; i++){
            if(vote==0){
                ele=nums[i];
            }
            if(ele==nums[i]){
                vote++;
            }
            else{
                vote--;
            }
        }
        
        return ele;
    }
}