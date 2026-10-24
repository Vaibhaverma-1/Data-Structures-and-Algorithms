class Solution {
    public int scoreOfParentheses(String s) {
        int n =s.length();
        int res=0;
        int depth=0;
        for(int i=0; i<n; i++){
            if(s.charAt(i)=='('){
                depth++;
            }
            else{
                depth--;
                if(s.charAt(i-1)=='('){
                    res+= Math.pow(2,depth);
                }
                
               

            }
        }
        return res;

    }
}