class Solution {
    public int maxFreqSum(String s) {
        int[] set = new int[26];
        int n= s.length();
        for(int i=0; i<n; i++){
            set[s.charAt(i)-'a']++;
        }
        int maxVow= Integer.MIN_VALUE, maxCon = Integer.MIN_VALUE;
        for(int i=0; i<26; i++){
            char ch =(char)(i+'a');
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                maxVow = Math.max(maxVow, set[ch-'a']);
            }else{
                maxCon = Math.max(maxCon, set[ch-'a']);
            }
        }
        return maxVow+maxCon;
    }
}