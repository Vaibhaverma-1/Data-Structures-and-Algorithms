class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;

        for (int i = left; i <= right; i++) {
            String w = words[i];
            char first = w.charAt(0);
            char last = w.charAt(w.length() - 1);

            if (isVowel(first) && isVowel(last)) {
                count++;
            }
        }
        return count;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
