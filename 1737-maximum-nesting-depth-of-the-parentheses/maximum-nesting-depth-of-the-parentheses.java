class Solution {
    public int maxDepth(String s) {
        int freq=0;
        int maxfreq=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                freq++;
                maxfreq=Math.max(freq,maxfreq);
            }
            else if(s.charAt(i)==')'){
                freq--;
            }
            else{
                maxfreq=Math.max(freq,maxfreq);
            }
        }
        return maxfreq;
        
    }
}