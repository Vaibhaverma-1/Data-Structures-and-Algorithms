class Solution {
    public String reversePrefix(String s, int k) {
        int n = s.length();
        char[] ch = s.toCharArray();
        if(k>n) return "";
        
            int low =0;
            int high = k-1;
            while(low<=high){
              char temp =  ch[low];
              ch[low] = ch[high];
              ch[high]= temp;
              low++;
              high--;
            }
            
        
        return new String(ch);
    }
}