class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        int hMax=0;
        for(int i=n-1; i>=0; i--){
            if(citations[i]>=(n-i)){
                hMax =(n-i);
            }
            else{
                break;
            }
        }
        return hMax;
    }
    
}