import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Map to store grouped anagrams
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            int[] count = new int[26]; // frequency array
            for (int i = 0; i < s.length(); i++) {
                count[s.charAt(i) - 'a']++;
            }

            // Convert frequency array to a key string
            String key = Arrays.toString(count);

            // If key not in map, add a new list
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            // Add current string to the correct group
            map.get(key).add(s);
        }

        // Convert map values to a list of lists
        List<List<String>> result = new ArrayList<>();
        for (List<String> group : map.values()) {
            result.add(group);
        }

        return result;
    }
}
