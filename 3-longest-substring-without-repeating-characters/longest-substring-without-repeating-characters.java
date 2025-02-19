class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] ch = new int[256]; // Extended to handle all ASCII characters
        int count = 0;
        int maxCount = 0;
        int start = 0; // Tracks the start of the current substring

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            // If the character is already in the current substring, reset the start
            if (ch[currentChar] > start) {
                start = ch[currentChar];
            }
            // Update the index of the current character
            ch[currentChar] = i + 1;
            // Calculate the length of the current substring
            count = i - start + 1;
            // Update maxCount if the current substring is longer
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}