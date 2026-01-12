class Solution {
    public String longestCommonPrefix(String[] strs) {

        int n = strs.length;
        if (n == 0) return "";
        if (n == 1) return strs[0];

        StringBuilder sb = new StringBuilder(strs[0]);

        for (int i = 1; i < n; i++) {
            int p = 0;
            int len = strs[i].length();

            while (p < len && p < sb.length()) {
                if (strs[i].charAt(p) != sb.charAt(p)) {
                    sb.setLength(p);
                    break;  
                } else {
                    p++;
                }
            }

            sb.setLength(Math.min(sb.length(), p));

            
        }

        return sb.toString();
    }
}
