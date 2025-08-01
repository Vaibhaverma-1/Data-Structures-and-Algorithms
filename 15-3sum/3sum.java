import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // skip dup anchors
            int l = i + 1, r = n - 1;

            while (l < r) {
                long sum = (long) nums[i] + nums[l] + nums[r]; // avoid overflow
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    int lv = nums[l], rv = nums[r];
                    while (l < r && nums[l] == lv) l++; // skip dup lefts
                    while (l < r && nums[r] == rv) r--; // skip dup rights
                } else if (sum < 0) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return res;
    }
}
