class Solution {
    public int countVowelSubstrings(String word) {
        int[] container = new int[5];
        int n = word.length();
        int l = 0, r = 0, ans = 0;

        while (l < n) {
            while (r < n && !hasAll(container)) {
                char ch = word.charAt(r);
                if (ch == 'a') container[0]++;
                else if (ch == 'e') container[1]++;
                else if (ch == 'i') container[2]++;
                else if (ch == 'o') container[3]++;
                else if (ch == 'u') container[4]++;
                else {
                    setZero(container);
                    l = r + 1;            // reset window after consonant
                }
                r++;
            }
            if (!hasAll(container)) break;

            // MINIMAL CHANGE: count only within this vowel block
            int t = r;
            while (t < n && isVowel(word.charAt(t))) t++;
            ans += (t - r + 1);

            char left = word.charAt(l);
            if (left == 'a') container[0]--;
            else if (left == 'e') container[1]--;
            else if (left == 'i') container[2]--;
            else if (left == 'o') container[3]--;
            else if (left == 'u') container[4]--;
            l++;
        }
        return ans;
    }

    private boolean hasAll(int[] arr) {
        return arr[0] > 0 && arr[1] > 0 && arr[2] > 0 && arr[3] > 0 && arr[4] > 0;
    }
    void setZero(int[] arr){
        for (int i = 0; i < arr.length; i++) arr[i] = 0;
    }
    private boolean isVowel(char c) {
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
}
