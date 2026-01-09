class Solution {
    public String largestEven(String s) {
        int n = s.length();
        int ind=n-1;
        for(int i=n-1; i>=0; i--){
            if(s.charAt(i)=='1'){
                ind--;
            }
            else{
                break;
            }
        }
        return ind>=0? s.substring(0,ind+1):"";
    }
}