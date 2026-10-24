class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        int n=s.length();
        int i=0;
        int res=0;
        while(i<n){
            if(s.charAt(i)=='('){
                st.push(-1);
            }else{
                int sum=0;
                while(!st.isEmpty() && st.peek()!=-1){
                    sum+=st.pop();
                }
                st.pop();
                if(sum==0) st.push(1);
                else st.push(2*sum);
            }
            i++;
        }
        while(!st.isEmpty()){
            res+=st.pop();
        }
        return res;
    }
}