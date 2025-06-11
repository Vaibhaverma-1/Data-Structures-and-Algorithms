class Solution {
    public char kthCharacter(int k) {
        StringBuilder s = new StringBuilder("a");
        
        while (s.length() < k) {
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char ch = (char) ('a' + (s.charAt(i) - 'a' + 1) % 26);
                temp.append(ch);
            }
            s.append(temp);
        }

        return s.charAt(k - 1); // k is 1-based index
    }
}
