class Solution {
    int MOD = 1_000_000_007;

    public int concatenatedBinary(int n) {
        return helper(n);
    }

    private int helper(int n) {
        if (n == 1) return 1;

        long prev = helper(n - 1);

        // manually count bits
        int temp = n;
        int bits = 0;
        while (temp > 0) {
            bits++;
            temp >>= 1;
        }

        return (int)(((prev << bits) % MOD + n) % MOD);
    }
}