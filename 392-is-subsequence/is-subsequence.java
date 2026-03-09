class Solution {
    public boolean isSubsequence(String s, String t) {

        int n = s.length(), m = t.length();
        int last = 0;

        for (int i = 0; i < n; i++) {

            char ch = s.charAt(i);

            while (last < m && t.charAt(last) != ch) {
                last++;
            }

            if (last == m) {
                return false;  
            }

            last++;
        }

        return true;
    }
}