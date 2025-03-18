class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int[] lastIndex = new int[256];
        
        // Initialize all indices to -1
        for (int i = 0; i < 256; i++) {
            lastIndex[i] = -1;
        }
        
        int l = 0;      // Left pointer of the window
        int maxLen = 0; // Maximum length of substring found
        
        // Iterate over the string using r as the right pointer
        for (int r = 0; r < n; r++) {
            char c = s.charAt(r);
            // If the character was seen before and is within the current window, move l
            if (lastIndex[c] >= l) {
                l = lastIndex[c] + 1;
            }
            
            // Update the last seen index for this character
            lastIndex[c] = r;
            
            // Calculate the length of the current window and update maxLen
            maxLen = Math.max(maxLen, r - l + 1);
        }
        
        return maxLen;
    }
}
