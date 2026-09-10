class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int i=0,j=0,maxLen=0;
        int n=s.length();
        while(j<n){
            int id=s.charAt(j)-'A';
            freq[id]++;
            int maxfreq=0;
            for(int l=0;l<26;l++){
                maxfreq=Math.max(maxfreq,freq[l]);
            }
            int diff=j-i+1-maxfreq;
            while(diff>k){
                freq[s.charAt(i)-'A']--;
                i++;
                maxfreq=0;
                for(int l=0;l<26;l++){
                    maxfreq=Math.max(maxfreq,freq[l]);
                }
                diff=j-i+1-maxfreq;
            }
            maxLen=Math.max(maxLen,j-i+1);
            j++;
        }
        return maxLen;
    }
}