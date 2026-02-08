class Solution {
    public int minimumDeletions(String s) {
        int n = s.length();
        int a_count=0, b_count=0;
        for(int i=0; i<n; i++){
            if(s.charAt(i)=='a'){
               a_count++;
            }
            else{
                b_count++;
            }
        }
        int[] a = new int[n];
        int[] b = new int[n];
        b[0]=0;
        for(int i=1; i<n; i++){
            if(s.charAt(i-1)=='b'){
            b[i]=b[i-1]+1;
            }
            else{
                b[i]=b[i-1];
            }
        } 
        a[n-1]=0; 
        for(int i=n-2; i>=0; i--){
            if(s.charAt(i+1)=='a'){
                a[i]=a[i+1]+1;
            }
            else{
                a[i]=a[i+1];
            }
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n; i++){
           ans = Math.min(ans, a[i]+b[i]);
        }
    
        return ans;
        
    }
}