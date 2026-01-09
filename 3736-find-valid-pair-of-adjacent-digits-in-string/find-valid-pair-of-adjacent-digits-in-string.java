class Solution{
    public String findValidPair(String s){
        int n=s.length();
        int[] f=new int[10];
        for(int i=0;i<n;i++)f[s.charAt(i)-'0']++;
        for(int i=0;i<n-1;i++){
            int a=s.charAt(i)-'0',b=s.charAt(i+1)-'0';
            if(a!=b&&f[a]==a&&f[b]==b)return ""+s.charAt(i)+s.charAt(i+1);
        }
        return "";
    }
}
