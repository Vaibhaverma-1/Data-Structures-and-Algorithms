class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maxProd = nums[0], minProd = nums[0], ans = nums[0];

        for (int i = 1; i < n; i++) {
            int x = nums[i];
            int a = maxProd * x, b = minProd * x;
            maxProd = Math.max(x, Math.max(a, b));
            minProd = Math.min(x, Math.min(a, b));
            ans = Math.max(ans, maxProd);
        }
        return ans;
    }
}
