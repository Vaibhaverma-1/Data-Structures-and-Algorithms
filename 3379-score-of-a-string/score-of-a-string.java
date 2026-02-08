class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        for(int i=0; i<s.length()-1; i++){
            int f=s.charAt(i);
            int sec=s.charAt(i+1);
            sum=sum+Math.abs(f-sec);
        }

        return sum;
        
    }
}