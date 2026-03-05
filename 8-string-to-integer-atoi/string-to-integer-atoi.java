class Solution {
    public int myAtoi(String s) {

        s = s.strip();
        int n = s.length();
        if (n == 0) return 0;

        long num = 0;
        boolean number = false;
        int sign = 1;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if ((ch == '+' || ch == '-') && !number) {
                sign = (ch == '-') ? -1 : 1;
                number = true;
                continue;
            }
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                break;
            }
            if (ch >= '0' && ch <= '9') {
                number = true;
                num = num * 10 + (ch - '0');
                if (sign == 1 && num > Integer.MAX_VALUE)
                    return Integer.MAX_VALUE;
                    if (sign == -1 && -num < Integer.MIN_VALUE)
                    return Integer.MIN_VALUE;
            } else {
                break;  
            }
        }

        return (int)(num * sign);
    }
}
//perform s.trim to remvoe any trailing leading space then according to recursive tree logic,
//if encountered non zero boolean, then use 0 else skip
//if encounter lower case letter stop reading
//if encounter -,+ after non zero number then also stop reading