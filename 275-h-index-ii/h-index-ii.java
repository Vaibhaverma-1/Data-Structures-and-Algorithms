class Solution {
    public int hIndex(int[] cit) {
         int n = cit.length;

        for (int i = 0; i < n; i++) {
            int h = n - i;
            if (cit[i] >= h) return h;
        }

        return 0;
    }
}