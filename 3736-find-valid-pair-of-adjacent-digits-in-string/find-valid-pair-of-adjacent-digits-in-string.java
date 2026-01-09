class Solution {
    public String findValidPair(String s) {
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            int freq=0;
            if(map.containsKey(s.charAt(i)))
            {
                freq = map.get(s.charAt(i));
            }
            freq++;
            map.put(s.charAt(i),freq);
        }
        for (int i = 0; i < n - 1; i++) {
            if (map.get(s.charAt(i)) == s.charAt(i) - '0'
             && map.get(s.charAt(i + 1)) == s.charAt(i + 1) - '0' && s.charAt(i)!=s.charAt(i+1)) {

                return "" + s.charAt(i) + s.charAt(i + 1);
            }
        }
        return "";
    }
}