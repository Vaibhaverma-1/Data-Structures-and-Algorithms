class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length();
        ArrayList<Integer> list = new ArrayList<>();
        int m = p.length();
        int[] count = new int[26];
        int[] freq_p= new int[26];
        for(int i=0; i<m; i++){
            freq_p[p.charAt(i)-'a']++;
        }
        int left=0;
        for(int right=0; right<n; right++){
            count[s.charAt(right)-'a']++;
           
            while(right-left+1>m){
                count[s.charAt(left)-'a']--;
                left++;
            }
            if(right-left+1==m && Arrays.equals(count,freq_p)){
                list.add(left);
            }
        }
        return list;
    }
}