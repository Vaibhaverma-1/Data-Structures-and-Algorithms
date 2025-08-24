class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // skip duplicates for i
            if (nums[i] > 0) break;

            HashSet<Integer> set = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int k = -(nums[i] + nums[j]);
                if (set.contains(k)) {
                    list.add(Arrays.asList(nums[i], nums[j], k));

                    // skip duplicates for j inside for loop
                    while (j + 1 < n && nums[j] == nums[j + 1]) {
                        j++;
                    }
                } else {
                    set.add(nums[j]);
                }
            }
        }

        return list;
    }
}
