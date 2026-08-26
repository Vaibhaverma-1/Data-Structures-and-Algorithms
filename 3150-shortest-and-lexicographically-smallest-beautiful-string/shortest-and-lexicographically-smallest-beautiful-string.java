class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int i=0,j=0,n=s.length(),count=0;
        String str="";

        while(j<n){
            while(j<n && count<k){
                if(s.charAt(j)=='1') count++;
                j++;
            }

            if(count<k) break;

            while(i<j && s.charAt(i)=='0') i++;

            String temp=s.substring(i,j);

            if(str.isEmpty() || temp.length()<str.length()){
                str=temp;
            }
            else if(temp.length()==str.length()){
                for(int x=0;x<temp.length();x++){
                    if(temp.charAt(x)<str.charAt(x)){
                        str=temp;
                        break;
                    }
                    if(temp.charAt(x)>str.charAt(x)) break;
                }
            }

            if(s.charAt(i)=='1') count--;
            i++;
        }

        return str;
    }
}