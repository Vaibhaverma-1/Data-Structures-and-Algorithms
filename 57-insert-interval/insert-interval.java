class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n=intervals.length;
        List<int[]> ans=new ArrayList<>();
        int i=0;
        boolean inserted=false;

        while(i<n){
            int start1=intervals[i][0];
            int end1=intervals[i][1];

            if(inserted || end1<newInterval[0]){
                ans.add(intervals[i]);
            }
            else if(start1>newInterval[1]){
                ans.add(newInterval);
                ans.add(intervals[i]);
                inserted=true;
            }
            else{
                newInterval[0]=Math.min(start1,newInterval[0]);
                newInterval[1]=Math.max(end1,newInterval[1]);
            }
            i++;
        }

        if(!inserted){
            ans.add(newInterval);
        }

        return ans.toArray(new int[ans.size()][]);
    }
}