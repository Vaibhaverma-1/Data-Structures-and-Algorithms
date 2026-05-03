class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        for(int i=0; i<words1.length; i++){
            int freq=0;
            if(map1.containsKey(words1[i])){
                freq=map1.get(words1[i]);
            }
            freq++;
            map1.put(words1[i],freq);
        }

        for(int i=0; i<words2.length; i++){
            int freq=0;
            if(map2.containsKey(words2[i])){
                freq=map2.get(words2[i]);
            }
            freq++;
            map2.put(words2[i],freq);
        }

        int count=0;

        for(int i=0; i<words1.length; i++){
            if(map1.containsKey(words1[i]) && map1.get(words1[i])==1){
                if(map2.containsKey(words1[i]) && map2.get(words1[i])==1){
                    count++;
                    map1.remove(words1[i]);
                }
            }
        }

        return count;
    }
}