class Solution {
    public List<Integer> findSubstring(String s, String[] words) {

        List<Integer> ans = new ArrayList<>();

        int wordLen = words[0].length();
        int totalWords = words.length;

        HashMap<String, Integer> original = new HashMap<>();

        for (String word : words) {
            original.put(word, original.getOrDefault(word, 0) + 1);
        }

        // Different possible offsets
        for (int offset = 0; offset < wordLen; offset++) {

            int i = offset;
            int count = 0;

            HashMap<String, Integer> current = new HashMap<>();

            for (int j = offset; j + wordLen <= s.length(); j += wordLen) {

                String word = s.substring(j, j + wordLen);

                // Word isn't required at all
                if (!original.containsKey(word)) {
                    current.clear();
                    count = 0;
                    i = j + wordLen;
                    continue;
                }

                // Add word
                current.put(word, current.getOrDefault(word, 0) + 1);
                count++;

                // Too many occurrences of this word
                while (current.get(word) > original.get(word)) {

                    String leftWord = s.substring(i, i + wordLen);

                    current.put(leftWord, current.get(leftWord) - 1);

                    i += wordLen;
                    count--;
                }

                // We have exactly all required words
                if (count == totalWords) {
                    ans.add(i);

                    // Move left once for next possible answer
                    String leftWord = s.substring(i, i + wordLen);
                    current.put(leftWord, current.get(leftWord) - 1);

                    i += wordLen;
                    count--;
                }
            }
        }

        return ans;
    }
}