import java.util.HashMap;

class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int maxlen = 0;
        int l = 0, r = 0;
        int maxFreq = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        while (r < n) {
            char rightChar = s.charAt(r);
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(rightChar));

            if ((r - l + 1) - maxFreq > k) {
                char leftChar = s.charAt(l);
                map.put(leftChar, map.get(leftChar) - 1);
                l++;
            }

            maxlen = Math.max(maxlen, r - l + 1);
            r++;
        }

        return maxlen;
    }
}
