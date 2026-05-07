class Solution {
    public boolean closeStrings(String word1, String word2) {

        if(word1.length() != word2.length()) return false;

        int[] set1 = new int[26];
        int[] set2 = new int[26];

        for(int i=0; i<word1.length(); i++){
            set1[word1.charAt(i)-'a']++;
            set2[word2.charAt(i)-'a']++;
        }

        for(int i=0; i<26; i++){
            if((set1[i]==0) != (set2[i]==0)){
                return false;
            }
        }

        Arrays.sort(set1);
        Arrays.sort(set2);

        return Arrays.equals(set1, set2);
    }
}