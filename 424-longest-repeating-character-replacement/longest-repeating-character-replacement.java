import java.util.HashMap;

class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int maxlen = 0;
        int l = 0, r = 0;
        int maxFreq = 0;
        int[] hashset = new int[26];

        while (r < n) {
            int right = s.charAt(r)-'A';
            hashset[right]++;
            maxFreq = Math.max(maxFreq, hashset[right]);

            if ((r - l + 1) - maxFreq > k) {
                int left= s.charAt(l)-'A';
                hashset[left]--;
                l++;
            }

            maxlen = Math.max(maxlen, r - l + 1);
            r++;
        }

        return maxlen;
    }
}
