import java.util.*;

class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> seen = new HashSet<>();
        Set<String> repeats = new HashSet<>();
        List<String> result = new ArrayList<>();

        int windowSize = 10;

        if (s.length() < windowSize) {
            return result;
        }

        for (int i = 0; i <= s.length() - windowSize; i++) {
            String sub = s.substring(i, i + windowSize);

            if (!seen.add(sub)) {
                repeats.add(sub);
            }
        }

        result.addAll(repeats);
        return result;
    }
}
