class Solution {
    public int countGoodNumbers(long n) {
        int mod = 1000000007;

        long even = (n + 1) / 2;
        long odd = n / 2;

        long evenPow = modPow(5, even, mod);
        long oddPow = modPow(4, odd, mod);

        return (int)((evenPow * oddPow) % mod);
    }

    private long modPow(long base, long exp, int mod) {
        long result = 1;
        base = base % mod;

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
