class Solution {
    public String findValidPair(String s) {
        int n = s.length();
        int[] freq = new int[10];

        // count digit frequency
        for (int i = 0; i < n; i++) {
            freq[s.charAt(i) - '0']++;
        }

        // check adjacent pair
        for (int i = 0; i < n - 1; i++) {
            int a = s.charAt(i) - '0';
            int b = s.charAt(i + 1) - '0';

            if (a != b && freq[a] == a && freq[b] == b) {
                return "" + s.charAt(i) + s.charAt(i + 1);
            }
        }
        return "";
    }
}
