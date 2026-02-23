class Solution {
    public boolean hasAllCodes(String s, int k) {

        if (k > s.length()) return false;

        int need = 1 << k;
        boolean[] seen = new boolean[need];
        int hash = 0;
        int mask = need - 1;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            // build rolling hash
            hash = ((hash << 1) & mask) | (s.charAt(i) - '0');

            // start checking only when window >= k
            if (i >= k - 1) {
                if (!seen[hash]) {
                    seen[hash] = true;
                    count++;
                }
            }
        }

        return count == need;
    }
}