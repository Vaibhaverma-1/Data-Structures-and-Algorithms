class Solution {
    public int longestBalanced(String s) {
          int n = s.length();
    int res = 0;

    for (int left = 0; left < n; left++) {
        Map<Character, Integer> freq = new HashMap<>();
        for (int right = left; right < n; right++) {
            char ch = s.charAt(right);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);

            int min = Collections.min(freq.values());
            int max = Collections.max(freq.values());

            if (min == max) {
                res = Math.max(res, right - left + 1);
            }
        }
    }
    return res;
    }
}