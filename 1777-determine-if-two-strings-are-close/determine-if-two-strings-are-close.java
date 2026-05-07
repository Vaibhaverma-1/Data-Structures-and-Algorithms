class Solution {
    public boolean closeStrings(String word1, String word2) {
        int n1 = word1.length(), n2 = word2.length();
        if(n1!=n2) return false;
        int[] set1 = new int[26];
        int[] set2 = new int[26];
        for(int i=0; i<n1; i++){
            set1[word1.charAt(i)-'a']++;
            set2[word2.charAt(i)-'a']++;
        }
        for(int i=0; i<n1; i++){
            if(set2[word1.charAt(i)-'a']==0||set1[word2.charAt(i)-'a']==0) return false;
        }
        Arrays.sort(set1);
        Arrays.sort(set2);
        
        return Arrays.equals(set1,set2);
    }
}