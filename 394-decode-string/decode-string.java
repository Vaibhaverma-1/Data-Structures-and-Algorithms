class Solution{
    public String decodeString(String s){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=']'){
                st.push(ch);
            }
            else{
                StringBuilder curr=new StringBuilder();
                while(st.peek()!='['){
                    curr.append(st.pop());
                }
                curr.reverse();
                st.pop();
                StringBuilder num=new StringBuilder();
                while(!st.isEmpty()&&Character.isDigit(st.peek())){
                    num.append(st.pop());
                }
                num.reverse();
                int k=Integer.parseInt(num.toString());
                String temp=curr.toString();
                for(int j=0;j<k;j++){
                    for(int l=0;l<temp.length();l++){
                        st.push(temp.charAt(l));
                    }
                }
            }
        }
        StringBuilder ans=new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}