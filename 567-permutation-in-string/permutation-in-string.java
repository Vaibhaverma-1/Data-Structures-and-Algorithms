class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        if (m > n) return false;

        int[] need = new int[26];
        for (int i = 0; i < m; i++) need[s1.charAt(i) - 'a']++;

        int[] have = new int[26];
        int required = m; // how many characters still needed to match s1's multiset

        int l = 0, r = 0;
        while (r < n) {
            int in = s2.charAt(r) - 'a';
            if (need[in] > 0) {
                if (have[in] < need[in]) required--; // we satisfied one needed char
                have[in]++;
            }
            r++;

            // keep window size at most m
            while (r - l > m) {
                int out = s2.charAt(l) - 'a';
                if (need[out] > 0) {
                    if (have[out] <= need[out]) required++; // we lose a needed char
                    have[out]--;
                }
                l++;
            }

            if (required == 0) return true; // window of size m contains a permutation
        }
        return false;
    }
}
