class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int[] rotated = new int[n];

        for (int r = 0; r < n; r++) {
            int idx = 0;
            for (int i = r; i < n; i++) {
                rotated[idx++] = nums[i];
            }
            for (int i = 0; i < r; i++) {
                rotated[idx++] = nums[i];
            }

            boolean isSorted = true;
            for (int i = 1; i < n; i++) {
                if (rotated[i] < rotated[i - 1]) {
                    isSorted = false;
                    break;
                }
            }

            if (isSorted) return true; 
        }

        return false; 
    }
}
