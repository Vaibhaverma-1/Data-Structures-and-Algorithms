class Solution {
    public boolean checkOnesSegment(String s) {
        int count=0;
        int n = s.length();
        boolean one = false;
        for(int i=0; i<n; i++){
            if(s.charAt(i)=='1'){
                one= true;
            }
            if(s.charAt(i)=='0' && one){
                count++;
            }
            if(one && s.charAt(i)=='1' && count>0){
                return false;
            }
        }
        return true;
    }
}