class Solution {
    public String minWindow(String s, String t) {
        int n=s.length(),m=t.length();
        int high=0,low=0,count=m,minlen=Integer.MAX_VALUE;
        int[] ans=new int[2];
        int[] lower=new int[26];
        int[] upper=new int[26];
        int[] lowerWindow=new int[26];
        int[] upperWindow=new int[26];

        for(int i=0;i<m;i++){
            char ch=t.charAt(i);
            if(ch>='a' && ch<='z'){
                lower[ch-'a']++;
            }
            else{
                upper[ch-'A']++;
            }
        }

        while(high<n){
            char ch=s.charAt(high);

            if(ch>='a' && ch<='z'){
                int index=ch-'a';
                lowerWindow[index]++;
                if(lowerWindow[index]<=lower[index]){
                    count--;
                }
            }
            else{
                int index=ch-'A';
                upperWindow[index]++;
                if(upperWindow[index]<=upper[index]){
                    count--;
                }
            }

            while(count==0){
                int len=high-low+1;

                if(len<minlen){
                    minlen=len;
                    ans[0]=low;
                    ans[1]=high;
                }

                char left=s.charAt(low);

                if(left>='a' && left<='z'){
                    int index=left-'a';

                    if(lowerWindow[index]<=lower[index]){
                        count++;
                    }

                    lowerWindow[index]--;
                }
                else{
                    int index=left-'A';

                    if(upperWindow[index]<=upper[index]){
                        count++;
                    }

                    upperWindow[index]--;
                }

                low++;
            }

            high++;
        }

        if(minlen==Integer.MAX_VALUE) return "";
        return s.substring(ans[0],ans[1]+1);
    }
}