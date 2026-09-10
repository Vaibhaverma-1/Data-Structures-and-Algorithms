class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int i=0,j=0,maxLen=0;
        int n=s.length();
       int maxfreq=0;

while(j<n){
    int id=s.charAt(j)-'A';
    freq[id]++;

    maxfreq=Math.max(maxfreq,freq[id]);

    int diff=j-i+1-maxfreq;

    if(diff>k){
        freq[s.charAt(i)-'A']--;
        i++;
    }

    maxLen=Math.max(maxLen,j-i+1);
    j++;
}
        return maxLen;
    }
}