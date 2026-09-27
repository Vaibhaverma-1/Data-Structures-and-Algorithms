class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int n = s.length();

        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);

            if(ch == '(' || (ch >= 'a' && ch <= 'z')){
                st.push(ch);
            } else {
                while(st.peek() != '('){
                    sb.append(st.pop());
                }
                st.pop();

                for(int j = 0; j < sb.length(); j++){
                    st.push(sb.charAt(j));
                }

                sb.setLength(0);
            }
        }

        while(!st.isEmpty()){
            sb.append(st.pop());
        }

        return sb.reverse().toString();
    }
}