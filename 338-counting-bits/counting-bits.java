class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i=0; i<ans.length; i++){
            ans[i]= hammingWeight(i);
        }
        return ans;
    }
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n &= (n - 1);  // clear the lowest set bit
            count++;
        }
        return count;
    }
}