class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i=0; i<n; i++){
            int[] set = new int[26];
            for(int j=0; j<strs[i].length(); j++){
                set[strs[i].charAt(j)-'a']++;
            }
            List<String> ans = new ArrayList<>();
            if(map.containsKey(Arrays.toString(set))){
                ans = map.get(Arrays.toString(set));
            }
            ans.add(strs[i]);
            map.put(Arrays.toString(set), ans);
        }

            return new ArrayList<>(map.values());
    }
}