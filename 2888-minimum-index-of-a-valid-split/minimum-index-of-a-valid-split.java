import java.util.*;

class Solution {

    public int minimumIndex(List<Integer> nums) {

        int n = nums.size();

        // ---------- Step 1: Boyer-Moore to find candidate ----------
        int candidate = -1, count = 0;

        for (int x : nums) {
            if (count == 0) {
                candidate = x;
            }
            count += (x == candidate ? 1 : -1);
        }

        // ---------- Step 2: count total frequency ----------
        int total = 0;
        for (int x : nums) {
            if (x == candidate) total++;
        }

        // ---------- Step 3: prefix check ----------
        int leftCount = 0;

        for (int i = 0; i < n - 1; i++) {

            if (nums.get(i) == candidate) leftCount++;

            int leftLen = i + 1;
            int rightLen = n - i - 1;

            if (leftCount > leftLen / 2 &&
                (total - leftCount) > rightLen / 2) {
                return i;
            }
        }

        return -1;
    }
}
