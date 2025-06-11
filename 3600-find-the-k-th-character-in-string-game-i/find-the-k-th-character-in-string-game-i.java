class Solution {
    public char kthCharacter(int k) {
        String s = "a";
        
        while (s.length() < k) {
            String temp = "";
            for (int i = 0; i < s.length(); i++) {
                char ch = (char) ('a' + (s.charAt(i) - 'a' + 1) % 26);
                temp = temp+ Character.toString(ch);
            }
            s=s+temp;
        }

        return s.charAt(k - 1); // k is 1-based index
    }
}
