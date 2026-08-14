class Solution {
    public int maximumLengthSubstring(String s) {
        int[] hashset = new int[26];
        int n = s.length();
        int j=0,i=0;
        int maxlen=0,len=0;
        while(i<n && j<n){
            int val =(s.charAt(j)-'a');
            hashset[val]++;
            len++;
            while(hashset[val]>2){
                hashset[s.charAt(i)-'a']--;
                i++;
                len--;
            }

            j++;
            maxlen=Math.max(maxlen,len);
            
        }
        return maxlen;
    }
}