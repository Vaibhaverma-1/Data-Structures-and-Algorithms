class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i = 0;
        while (i < n) {
            int correct = nums[i] - 1;                       // <-- v goes to v-1
            if (nums[i] < 1 || nums[i] > n) {                // <-- ignore out-of-range
                i++;
            } else if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        for (int j = 0; j < n; j++) {
            if (nums[j] != j + 1) return j + 1;              // <-- check j+1
        }
        return n + 1;                                        // <-- all 1..n present
    }

    void swap(int[] arr, int i, int j) {
        int t = arr[i]; arr[i] = arr[j]; arr[j] = t;
    }
}
