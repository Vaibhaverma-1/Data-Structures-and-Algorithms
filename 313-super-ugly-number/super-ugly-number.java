class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        long[] arr = new long[n];
        arr[0]=1;
        int len = primes.length;
        int[] pointer = new int[len];
        for(int i=1; i<n; i++){
            long[] next = new long[len];
            long ans=Long.MAX_VALUE;
            for(int j=0; j<len; j++){
              next[j]=arr[pointer[j]]*primes[j];
              ans = Math.min(ans,next[j]);
            }
            arr[i]=ans;
            for(int j=0; j<len; j++){
                if(arr[i]==next[j]) pointer[j]++;
            }
        }
        return (int)arr[n-1];
    }
}
