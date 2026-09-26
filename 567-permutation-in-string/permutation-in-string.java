class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq1= new int[26];
        int[] freq2= new int[26];
        int n = s1.length(), m = s2.length();
        for(int i=0; i<n; i++){
            freq1[s1.charAt(i)-'a']++;
        }
        int i=0,j=0;
        while(j<m){
            char ch = s2.charAt(j);
            freq2[ch-'a']++;
            int len = j-i+1;
            boolean correct = true;
            while(len>n){
                char c = s2.charAt(i);
                freq2[c-'a']--;
                i++;
                len--;
            }
            if(len==n){
                for(int k=0; k<26; k++)
                {
                    if(freq1[k]!=freq2[k]){
                        correct = false;
                        break;
                    }
                }
                if(correct) return true;
            }
            j++;

        }
        return false;
    }
}