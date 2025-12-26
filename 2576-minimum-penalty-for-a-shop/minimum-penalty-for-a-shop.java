class Solution {
    public int bestClosingTime(String customers) {
        int n = customers.length();
        int[] sum = new int[n+1];
        for(int i=1; i<n; i++){
            if(customers.charAt(i)=='Y'){
                sum[0]++;
            }
        }
        int bestHour =0;
        int minPenalty = sum[0];
        for(int i=1; i<=n; i++){
            if(customers.charAt(i-1)=='Y') {
                sum[i]=sum[i-1]-1;
            }
            else{
                sum[i]=sum[i-1]+1;
            }
            if(sum[i]<minPenalty){
                minPenalty= sum[i];
                bestHour=i;
            }

        }
        return bestHour;
    }
}