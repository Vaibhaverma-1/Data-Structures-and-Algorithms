class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> a[1]-b[1]);
        int count=1;
        int endTime =intervals[0][1];
        int n = intervals.length;
        for(int i=1; i<n; i++){
            if(intervals[i][0]>=endTime){
                count++;
                endTime = intervals[i][1];
            }
        }
        return n-count;
    }
}