class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if (arr.length != pattern.length()) return false;

        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = arr[i];

            if (map1.containsKey(c) && !map1.get(c).equals(word)) return false;
            if (map2.containsKey(word) && map2.get(word) != c) return false;

            map1.put(c, word);
            map2.put(word, c);
        }
        return true;
    }
}