class Solution {
    public int countGoodNumbers(long n) {
        int mod = 1000000007; // ✅ Corrected from 1e+7 to actual value

        long even = (n + 1) / 2; // ✅ Handles both even and odd n correctly
        long odd = n / 2;

        // ❌ Math.pow returns double and can cause precision loss
        // ✅ Use modular exponentiation instead

        long evenPow = power(5, even, mod);
        long oddPow = power(4, odd, mod);

        return (int)((evenPow * oddPow) % mod);
    }

    // ✅ Modular exponentiation to safely compute large powers
    private long power(long base, long exp, int mod) {
        long result = 1;
        base %= mod;

        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp >>= 1;
        }

        return result;
    }
}
