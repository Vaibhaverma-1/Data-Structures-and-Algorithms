class Solution {
    
    public boolean hasAllCodes(String s, int k) {
        HashSet<String> set = new HashSet<>();
        // generateAll(set,k,0);
        int n = s.length();
        for(int i=0; i<=n-k; i++){
            StringBuilder temp= new StringBuilder();
            for(int j=i; j<i+k; j++){
                temp.append(s.charAt(j));

            }
            String val = temp.toString();
            set.add(val);
            temp.setLength(0);
        }

        // System.out.println(set);
        // return set.size()==(int)Math.pow(2,k)?true:false;
        return set.size() == (1 << k)?true:false;
    }
    // public void generateAll(HashSet<String> set, int k, int n){
       
    //    if(n==k){
    //     set.add(sb.toString());
    //     return;
    //    }
    //    sb.append('0');
    //    generateAll(set,k, n+1);
    //    sb.deleteCharAt(sb.length() - 1);
    //    sb.append('1');
    //    generateAll(set,k,n+1);
    //    sb.deleteCharAt(sb.length() - 1);

    // }
}