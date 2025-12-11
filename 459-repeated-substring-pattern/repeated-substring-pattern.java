class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();

        
        for (int len = 1; len <= n / 2; len++) {

          
            if (n % len != 0) continue;

            String part = s.substring(0, len);
            StringBuilder sb = new StringBuilder();

            int repeat = n / len;
            for (int i = 0; i < repeat; i++) {
                sb.append(part);
            }

            if (sb.toString().equals(s)) {
                return true;
            }
        }
        return false;
    }
}
