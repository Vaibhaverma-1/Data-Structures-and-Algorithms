class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> map = new HashMap<>();
        
        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");
        int n = arr1.length, m = arr2.length;

        for(int i=0; i<n; i++){
            String key = arr1[i];
            int freq=0;
            if(map.containsKey(key)){
               freq = map.get(key);
            }
            freq++;
            map.put(key,freq);
        }

        for(int i=0; i<m; i++){
            String key = arr2[i];
            int freq=0;
            if(map.containsKey(key)){
                freq = map.get(key);
            }
            freq++;
            map.put(key,freq);
        }

        ArrayList<String> list = new ArrayList<>();

        for(String key : map.keySet()){
            if(map.get(key) == 1){
                list.add(key);
            }
        }

        return list.toArray(new String[list.size()]);
    }
}