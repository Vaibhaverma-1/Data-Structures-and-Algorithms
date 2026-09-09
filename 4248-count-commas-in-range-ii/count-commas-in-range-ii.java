class Solution {
    public long countCommas(long n) {
        long ans = 0L;

        if (n < 1000) return 0L;

        // 10^3 to 10^6 - 1 -> 1 comma
        long end = Math.min(n, 999999L);
        ans += end - 1000L + 1;

        // 10^6 to 10^9 - 1 -> 2 commas
        if (n >= 1000000L) {
            end = Math.min(n, 999999999L);
            ans += (end - 1000000L + 1) * 2;
        }

        // 10^9 to 10^12 - 1 -> 3 commas
        if (n >= 1000000000L) {
            end = Math.min(n, 999999999999L);
            ans += (end - 1000000000L + 1) * 3;
        }

        // 10^12 to 10^15 - 1 -> 4 commas
        if (n >= 1000000000000L) {
            end = Math.min(n, 999999999999999L);
            ans += (end - 1000000000000L + 1) * 4;
        }

        // 10^15 -> 5 commas
        if (n >= 1000000000000000L) {
            ans += 5;
        }

        return ans;
    }
}