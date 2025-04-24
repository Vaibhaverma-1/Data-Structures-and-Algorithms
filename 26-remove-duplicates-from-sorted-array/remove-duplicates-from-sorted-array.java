class Solution {
    public int removeDuplicates(int[] nums) {
     TreeSet<Integer> set = new TreeSet<>();
     for(int i=0; i<nums.length; i++){
        set.add(nums[i]);
       
     }
     int i=0;
     for(int x:set){
        nums[i]=x;
        i++;
     }
     return set.size();

    }
}