class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ans=new ArrayList<>();
        int len=words[0].length(),n=words.length;
        HashMap<String,Integer> map=new HashMap<>();
        for(String word:words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        for(int offset=0;offset<len;offset++){
            int i=offset,count=0;
            HashMap<String,Integer> curr=new HashMap<>();
            for(int j=offset;j+len<=s.length();j+=len){
                String word=s.substring(j,j+len);
                if(!map.containsKey(word)){
                    curr.clear();
                    count=0;
                    i=j+len;
                    continue;
                }
                curr.put(word,curr.getOrDefault(word,0)+1);
                count++;
                while(curr.get(word)>map.get(word)){
                    String left=s.substring(i,i+len);
                    curr.put(left,curr.get(left)-1);
                    i+=len;
                    count--;
                }
                if(count==n) ans.add(i);
            }
        }
        return ans;
    }
}