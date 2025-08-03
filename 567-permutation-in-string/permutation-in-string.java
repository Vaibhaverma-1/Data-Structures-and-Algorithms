class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        if (m > n) return false;

        int[] need = new int[26];
        for (int i = 0; i < m; i++) need[s1.charAt(i) - 'a']++;

        int[] have = new int[26];
        int l = 0, r = 0;

        while (l + m <= n) {
            // grow window to size m
            while (r < n && r - l + 1 <= m) {
                have[s2.charAt(r) - 'a']++;
                r++;
            }

            // check if counts match
            if (isMatch(need, have)) return true;

            // slide window by one
            have[s2.charAt(l) - 'a']--;
            l++;
        }
        return false;
    }

    private boolean isMatch(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}
