class Solution {
    public int minFlips(int a, int b, int c) {
        int flips = 0;
        
        while (c > 0 || a > 0 || b > 0) {
            int bitC = c & 1;
            int bitA = a & 1;
            int bitB = b & 1;
            
            if (bitC == 1) {
                if (bitA == 0 && bitB == 0) {
                    flips++;
                }
            } else {
                if (bitA == 1) flips++;
                if (bitB == 1) flips++;
            }
            
            a >>= 1;
            b >>= 1;
            c >>= 1;
        }

        return flips;
    }
}