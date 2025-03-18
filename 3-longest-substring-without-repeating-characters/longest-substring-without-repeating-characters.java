class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int[] hash = new int[256];
        
        // Initialize all elements in hash array to -1
        for (int i = 0; i < 256; i++) {
            hash[i] = -1;
        }
        
        int l = 0;  // Left pointer
        int r = 0;  // Right pointer
        int maxlen = 0; // Store maximum length of substring
        
        while (r < n) {
            if (hash[s.charAt(r)] != -1) {
                if (hash[s.charAt(r)] >= l) {
                    l = hash[s.charAt(r)] + 1; // Move left pointer forward
                }
            }
            
            // Update maxlen with the current window size
            maxlen = Math.max(r - l + 1, maxlen);
            
            // Store the last occurrence of the character
            hash[s.charAt(r)] = r;
            
            r++; // Move right pointer forward
        }
        
        return maxlen;
    }
}
