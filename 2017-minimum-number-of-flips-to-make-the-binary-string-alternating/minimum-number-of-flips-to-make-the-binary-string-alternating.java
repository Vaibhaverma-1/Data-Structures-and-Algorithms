class Solution {
    public int minFlips(String s) {

        int n = s.length();
        String s2 = s + s;

        int ans = Integer.MAX_VALUE;
        int mismatchA = 0; // pattern 010101...
        int mismatchB = 0; // pattern 101010...

        int left = 0;

        for (int right = 0; right < 2 * n; right++) {

            char c = s2.charAt(right);

            char expectedA = (right % 2 == 0) ? '0' : '1';
            char expectedB = (right % 2 == 0) ? '1' : '0';

            if (c != expectedA) mismatchA++;
            if (c != expectedB) mismatchB++;

            // keep window size = n
            if (right - left + 1 > n) {

                char leftChar = s2.charAt(left);

                char leftExpectedA = (left % 2 == 0) ? '0' : '1';
                char leftExpectedB = (left % 2 == 0) ? '1' : '0';

                if (leftChar != leftExpectedA) mismatchA--;
                if (leftChar != leftExpectedB) mismatchB--;

                left++;
            }

            if (right - left + 1 == n) {
                ans = Math.min(ans, Math.min(mismatchA, mismatchB));
            }
        }

        return ans;
    }
}