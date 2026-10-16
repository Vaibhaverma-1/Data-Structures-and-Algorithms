class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans=new ArrayList<>();
        int n=intervals.length,i=0;
        while(i<n && intervals[i][1]<newInterval[0]){
            ans.add(intervals[i]);
            i++;
        }
        int start=newInterval[0];
        int end=newInterval[1];
        while(i<n && intervals[i][0]<=end){
            start=Math.min(start,intervals[i][0]);
            end=Math.max(end,intervals[i][1]);
            i++;
        }
        ans.add(new int[]{start,end});
        while(i<n){
            ans.add(intervals[i]);
            i++;
        }
        return ans.toArray(new int[ans.size()][]);
    }
}