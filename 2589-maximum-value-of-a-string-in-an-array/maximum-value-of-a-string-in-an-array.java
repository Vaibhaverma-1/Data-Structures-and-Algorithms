class Solution {

    public int maximumValue(String[] strs) {
        int max = 0;

        for (String s : strs) {
            if (isDigitString(s)) {
                max = Math.max(max, Integer.parseInt(s));
            } else {
                max = Math.max(max, s.length());
            }
        }
        return max;
    }

    boolean isDigitString(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }
}
