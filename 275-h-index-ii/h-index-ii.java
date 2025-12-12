class Solution {
    public int hIndex(int[] cit) {
         int n = cit.length;
        int l = 0, r = n-1;
        
        while (l<=r) {
            int mid = (l+r) / 2;
            if (cit[mid] >= n - mid) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return n - l;
    }
}