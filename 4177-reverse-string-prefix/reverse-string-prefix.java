class Solution{
    public String reversePrefix(String s,int k){
        int n=s.length();
        char[] ch=s.toCharArray();
        if(k>n)return "";
        int low=0,high=k-1;
        while(low<=high){
            char t=ch[low];
            ch[low]=ch[high];
            ch[high]=t;
            low++;high--;
        }
        return new String(ch);
    }
}
