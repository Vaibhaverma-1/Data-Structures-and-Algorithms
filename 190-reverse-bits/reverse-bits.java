class Solution {
    public int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res = res<<1;          // make room
            res = res|(n & 1);     // copy LSB
            n = n>> 1;           // unsigned shift right
        }
        return res;
    }
}