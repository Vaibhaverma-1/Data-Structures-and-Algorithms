class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int i = 0, maxLen = 0;

        for(int j = 0; j < nums.length; j++) {
            int val = nums[j];
            freq.put(val, freq.getOrDefault(val, 0) + 1);

            while(freq.get(val) > k) {
                int left = nums[i];
                freq.put(left, freq.get(left) - 1);
                i++;
            }

            maxLen = Math.max(maxLen, j - i + 1);
        }

        return maxLen;
    }
}