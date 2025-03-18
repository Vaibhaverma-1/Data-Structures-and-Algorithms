class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int[] hash = new int[256];

        for (int i = 0; i < 256; i++) {
            hash[i] = -1;
        }

        int l = 0, r = 0, maxlen = 0;

        while (r < n) {
            if (hash[s.charAt(r)] != -1) {
                if (hash[s.charAt(r)] >= l) {
                    l = hash[s.charAt(r)] + 1;
                }
            }

            maxlen = Math.max(r - l + 1, maxlen);
            hash[s.charAt(r)] = r;
            r++;
        }

        return maxlen;
    }
}
