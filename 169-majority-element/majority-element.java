class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map  = new HashMap<>();
        for(int i=0; i<n; i++){
            int freq=0;
            if(map.containsKey(nums[i])){
              freq=map.get(nums[i]);
            }
            map.put(nums[i], ++freq);
        }

        for(int i=0; i<n; i++){
            if(map.get(nums[i])>n/2) return nums[i];
        }
        return -1;
        
    }
}