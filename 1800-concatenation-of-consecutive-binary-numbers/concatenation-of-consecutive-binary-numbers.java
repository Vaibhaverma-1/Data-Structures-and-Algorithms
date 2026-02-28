class Solution {
    int MOD = 1_000_000_007;

    public int concatenatedBinary(int n) {
        return helper(1, n, 0);
    }

    private int helper(int curr, int n, long ans) {
        if (curr > n) return (int) ans;

        int temp = curr;

        // collect bits of curr
        int bits = 0;
        while (temp > 0) {
            bits++;
            temp >>= 1;
        }

        ans = ((ans << bits) % MOD + curr) % MOD;

        return helper(curr + 1, n, ans);
    }
}