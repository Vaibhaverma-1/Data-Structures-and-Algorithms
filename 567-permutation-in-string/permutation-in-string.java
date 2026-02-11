class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int[] freq_s1 = new int[26];
        for(int i=0; i<n; i++){
            freq_s1[s1.charAt(i)-'a']++;
        }
        int[] freq_s2 = new int[26];
        int left=0;
        for(int right =0; right<m; right++){
            freq_s2[s2.charAt(right)-'a']++;

            while(right-left+1>n){
                freq_s2[s2.charAt(left)-'a']--;
                left++;
            }
            if(right-left+1==n && Arrays.equals(freq_s1,freq_s2)){
                return true;
            }


        }
        return false;
    }
}