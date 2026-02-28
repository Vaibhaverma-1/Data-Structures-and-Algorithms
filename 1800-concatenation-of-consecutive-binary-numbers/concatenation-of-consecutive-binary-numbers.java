class Solution {
    int MOD = 1_000_000_007;

    public int concatenatedBinary(int n) {
        long ans = 0;
        int bitLength = 0;

        for (int i = 1; i <= n; i++) {

            // if i is power of 2, increase bit length
            if ((i & (i - 1)) == 0) {
                bitLength++;
            }

            ans = ((ans << bitLength) + i) % MOD;
        }

        return (int) ans;
    }
}