class Solution {
    int MOD = 1_000_000_007;

    public int concatenatedBinary(int n) {

        // 1️⃣ Build correct binary string
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(Integer.toBinaryString(i));
        }

        long ans = 0;

        // 2️⃣ Build number safely from left to right
        for (int i = 0; i < sb.length(); i++) {
            ans = (ans * 2 + (sb.charAt(i) - '0')) % MOD;
        }

        return (int) ans;
    }
}