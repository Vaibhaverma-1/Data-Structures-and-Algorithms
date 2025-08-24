class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // skip duplicate i

            int target = -nums[i];               // target depends on i
            int j = i + 1, k = n - 1;

            while (j < k) {
                int pair = nums[j] + nums[k];    // compare pair to target
                if (pair == target) {
                    list.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    // skip duplicates for j and k
                    while (j < k && nums[j] == nums[j + 1]) j++;
                    while (j < k && nums[k] == nums[k - 1]) k--;
                    j++;
                    k--;
                } else if (pair < target) {
                    j++; // need larger pair
                } else {
                    k--; // need smaller pair
                }
            }
        }
        return list;
    }
}
