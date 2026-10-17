class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] passengers = new int[1001];
        int n = trips.length;
        int maxCount=0;
        for(int i=0; i<n;i++){
            int p = trips[i][0];
            int s = trips[i][1];
            int e = trips[i][2];
            for(int j=s; j<e; j++){
                passengers[j]=passengers[j]+p;
                maxCount=Math.max(maxCount,passengers[j]);
            }
        }
        return maxCount<=capacity?true:false;

    }
}