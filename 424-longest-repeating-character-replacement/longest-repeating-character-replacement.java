import java.util.HashMap;

class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int maxlen = 0;
        int l = 0, r = 0;
        int maxFreq = 0;  // To track the highest frequency character in the window
        HashMap<Character, Integer> map = new HashMap<>();

        while (r < n) {
            char rightChar = s.charAt(r);
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(rightChar));  // Update max frequency

            // Check if we need to shrink the window
            if ((r - l + 1) - maxFreq > k) {
                char leftChar = s.charAt(l);
                map.put(leftChar, map.get(leftChar) - 1);
                l++; // Move the left pointer
            }

            maxlen = Math.max(maxlen, r - l + 1);
            r++;
        }

        return maxlen;
    }
}
