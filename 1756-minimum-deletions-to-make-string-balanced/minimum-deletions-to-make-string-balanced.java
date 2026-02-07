class Solution {
    public int minimumDeletions(String s) {
        int a_after = 0;
        int b_before = 0;

        // count total 'a'
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                a_after++;
            }
        }

        int ans = a_after; // case: delete all 'a'

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                a_after--; // this 'a' moves from right to left
            } else {
                b_before++; // this 'b' is now on the left
            }
            ans = Math.min(ans, b_before + a_after);
        }

        return ans;
    }
}
