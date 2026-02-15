import java.math.BigInteger;// i was unable to resolve case where binary was greater than int max valu, so big int was recommended

class Solution {
    public String addBinary(String a, String b) {
        int c1 = a.length();
        int c2 = b.length();
        BigInteger n1 = new BigInteger(a, 2);
        BigInteger n2 = new BigInteger(b, 2);
        BigInteger num3 = n1.add(n2);
        return num3.toString(2);
    }

    public BigInteger binToNum(String num, int count) {
        BigInteger n = BigInteger.ZERO;
        for (int i = 0; i < count; i++) {
            n = n.add(BigInteger.valueOf((long) Math.pow(2, i) * (num.charAt(num.length() - 1 - i) - '0')));
        }
        return n;
    }

    public String bn(BigInteger num) {
        StringBuilder sb = new StringBuilder();
        while (num.compareTo(BigInteger.ONE) >= 0) {
            sb.append(num.mod(BigInteger.valueOf(2)));
            num = num.divide(BigInteger.valueOf(2));
        }
        return sb.reverse().toString();
    }
}