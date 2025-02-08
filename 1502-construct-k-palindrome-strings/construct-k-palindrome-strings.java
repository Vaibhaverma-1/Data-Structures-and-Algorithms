class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length()==k){
            return true;
        }
        else if(s.length()<k){
            return false;
        }
        else{
        int hashset[] = new int[26];
        for(int i=0; i<s.length(); i++){
            hashset[s.charAt(i)-'a']++;
        }
        int oddcount=0;
        for(int i=0; i<hashset.length; i++){
            if(hashset[i]%2!=0){
                oddcount+=(hashset[i]%2);
                
                if(oddcount>k){
                    return false;
                }
            }
        }
        }
        return true;

    }
}