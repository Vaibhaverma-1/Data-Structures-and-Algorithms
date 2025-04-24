class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - k - 1);
        reverse(nums, n - k, n - 1);
        reverse(nums, 0, n - 1);
    }

    public void reverse(int[] nums, int a, int b) {
        while (a < b) { 
            int temp = nums[b];
            nums[b] = nums[a];
            nums[a] = temp;
            b--;
            a++;
        }
    }
}