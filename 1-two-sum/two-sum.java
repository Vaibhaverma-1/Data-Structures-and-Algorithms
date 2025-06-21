class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mp1 = new HashMap<>();
        int[] result = new int[2];
        
        for (int i = 0; i < nums.length; i++) {
            if (mp1.containsKey(target - nums[i])) {
                result[0] = mp1.get(target - nums[i]);
                result[1] = i;
                return result;
            }
            mp1.put(nums[i], i);
        }
        
        return result;
    }
}