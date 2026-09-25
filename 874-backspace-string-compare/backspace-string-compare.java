class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1=new Stack<>();
        Stack<Character> st2=new Stack<>();
        int n=s.length(),m=t.length();
        int i=0,j=0;
        while(i<n){
            if(s.charAt(i)=='#' && !st1.isEmpty()){
                st1.pop();
            }
            else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                st1.push(s.charAt(i));
            }
            i++;
        }
        while(j<m){
            if(t.charAt(j)=='#' && !st2.isEmpty()){
                st2.pop();
            }
            else if(t.charAt(j)>='a' && t.charAt(j)<='z'){
                st2.push(t.charAt(j));
            }
            j++;
        }
        while(!st1.isEmpty() && !st2.isEmpty()){
            if(st1.pop()!=st2.pop()) return false;
        }
        return st1.isEmpty() && st2.isEmpty();
    }
}