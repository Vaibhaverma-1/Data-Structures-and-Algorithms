class Solution {
    public int divide(int dividend, int divisor) {
        // Edge case: overflow (only case that overflows 32-bit signed int)
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Work in positives using long to safely take abs of MIN_VALUE
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;
        int ans = 0;

        // Repeatedly subtract the largest (b * 2^k) that fits into 'a'
        while (a >= b) {
            int shift = 0;
            // find largest shift where (b << (shift+1)) <= a
            while (a >= (b << (shift + 1))) {
                shift++;
            }
            a -= (b << shift);       // subtract that chunk
            ans += (1 << shift);     // add 2^shift to quotient
        }
        return sign == 1 ? ans : -ans;
    }
}
