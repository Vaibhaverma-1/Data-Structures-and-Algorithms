import java.util.HashMap;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // Step 1: Create a frequency map for magazine characters
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char ch : magazine.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Check if ransomNote can be formed
        for (char ch : ransomNote.toCharArray()) {
            if (!charCount.containsKey(ch) || charCount.get(ch) == 0) {
                return false; // character not available enough times
            }
            charCount.put(ch, charCount.get(ch) - 1); // use one occurrence
        }

        return true; // all characters matched
    }
}
