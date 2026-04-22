class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        int n = queries.length, m= dictionary.length, len=queries[0].length();
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
                for(int k=0; k<m; k++){
                    int edit =0;
                    for(int l=0; l<len; l++){
                         if(dictionary[k].charAt(l)!=queries[i].charAt(l)){
                            edit++;
                         }
                         if(edit>2){
                            break;
                         }
                    }
                    if(edit<=2){
                     ans.add(queries[i]);
                     break;
                     }
                   
                    
                }
                 
                
                

        }
        return ans;
    }
}