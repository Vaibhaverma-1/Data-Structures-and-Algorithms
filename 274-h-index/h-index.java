class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] arr = new int[n+1];
        int hMax=0;
        for(int i=0; i<n; i++){
            if(citations[i]>=n){
                arr[n]++;
            }
            else{
            arr[citations[i]]++;
            }
        }
        int sum=0;
        for(int i=n; i>=0; i--){
           if(sum+arr[i]>=i){
            return i;
           }
           sum+=arr[i];
        }
        return 0;
    }
    
}