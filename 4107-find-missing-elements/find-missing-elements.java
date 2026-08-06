class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        int min = nums[0],max=nums[n-1];
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        for(int i=min; i<=max; i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
       return list;
    }
}