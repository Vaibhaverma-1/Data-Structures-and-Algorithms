class Solution {
    public int maxVowels(String s, int k) {
        int maxLen = 0;
        int n = s.length();
        int l = 0, r = 0;
        int vow = 0;

        while (l + k <= n) {
            while (r < n && r - l + 1 <= k) {
                if (isVowel(s.charAt(r))) vow++;
                r++;
            }
            maxLen = Math.max(maxLen, vow);
            if (isVowel(s.charAt(l))) vow--;
            l++;
        }
        return maxLen;
    }

    private boolean isVowel(char ch) {
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }
}
