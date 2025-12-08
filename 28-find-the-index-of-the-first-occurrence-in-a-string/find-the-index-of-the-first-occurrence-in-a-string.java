class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        if (m == 0) return 0;
        if (m > n) return -1;

        for (int i = 0; i <= n - m; i++) {

            // Quick check using first character
            if (haystack.charAt(i) == needle.charAt(0)) {

                // Check whole window only if first char matches
                int j = 0;
                while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                    j++;
                }

                if (j == m) return i; // found match
            }
        }

        return -1;
    }
}