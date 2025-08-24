class Solution {
    public int findMin(int[] nums) {
        int l =0;
        int h=nums.length-1;
        int m= Integer.MAX_VALUE;
        while(l<=h){
            int mid = (l+h)/2;
            
            
            if(nums[l]<=nums[mid]){
                m = Math.min(nums[l],m);
                l=mid+1;
            }
            else{
                m = Math.min(nums[mid],m);
                h=mid-1;
                
            }
           
        }
        return m;
    }
}