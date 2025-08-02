class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
         Map<Integer, Integer> lastIndex = new HashMap<>(); // number -> last seen index

        for (int i = 0; i < nums.length; i++) {
            Integer prev = lastIndex.get(nums[i]);
            if (prev != null && i - prev <= k) {
                return true; // found same number within distance k
            }
            // update last seen index for this number
            lastIndex.put(nums[i], i);
        }

        return false; // no such pair found
    }
}