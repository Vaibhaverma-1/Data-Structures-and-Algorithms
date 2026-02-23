class Solution {
    public int strStr(String haystack, String needle) {

        int n = haystack.length();
        int m = needle.length();

        if (m == 0) return 0;
        if (m > n) return -1;

        long base = 31;
        long mod = 1_000_000_007;

        long needleHash = 0;
        long windowHash = 0;
        long power = 1; // base^(m-1)

        // compute base^(m-1)
        for (int i = 0; i < m - 1; i++) {
            power = (power * base) % mod;
        }

        // compute hash of needle and first window
        for (int i = 0; i < m; i++) {
            needleHash = (needleHash * base + (needle.charAt(i) - 'a' + 1)) % mod;
            windowHash = (windowHash * base + (haystack.charAt(i) - 'a' + 1)) % mod;
        }

        if (needleHash == windowHash) {
            return 0;
        }

        // slide window
        for (int i = m; i < n; i++) {

            // remove left char
            windowHash = (windowHash - 
                (haystack.charAt(i - m) - 'a' + 1) * power % mod + mod) % mod;

            // shift and add new char
            windowHash = (windowHash * base + 
                (haystack.charAt(i) - 'a' + 1)) % mod;

            if (windowHash == needleHash) {
                return i - m + 1;
            }
        }

        return -1;
    }
}