class Solution {
    public int minOperations(String s) {
        int n = s.length();
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        String sorted = new String(ch);
        if(sorted.equals(s)) return 0;
        // cant take entire string as substring
        if(n==2) return -1;
        //n>=3
        char start = s.charAt(0),end= s.charAt(n-1);
        if(start==sorted.charAt(0)||end==sorted.charAt(n-1)) return 1;
        if(start==sorted.charAt(n-1) && end==sorted.charAt(0) && start!=sorted.charAt(n-2) &&end!=sorted.charAt(1)) return 3;
        return 2;
        




    }
}