class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] freq = new int[128];  // counts for ASCII
        int n = s.length();
        int l = 0, r = 0, maxlen = 0;

        while (r < n) {
            char cr = s.charAt(r);
            freq[cr]++;

            // if cr is duplicated in the window, shrink from left
            while (freq[cr] > 1) {
                freq[s.charAt(l)]--;
                l++;
            }
            maxlen = Math.max(maxlen, r - l + 1);
            r++;
        }
        return maxlen;
    }
}
