class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] passengers = new int[1001];
        int n = trips.length;
        for(int i=0; i<n;i++){
            int p = trips[i][0];
            int s = trips[i][1];
            int e = trips[i][2];
            passengers[s]=passengers[s]+p;
            passengers[e]=passengers[e]-p;
            
        }
        int current =0;
        for(int i=0; i<=1000; i++){
            current +=passengers[i];
            if(current>capacity) return false;
        }
        return true;

    }
}