class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int n = points.length;
        int count=1;
        int commonStart = points[0][0];
        int commonEnd = points[0][1];
        for(int i=1; i<n; i++){
            int start = points[i][0];
            int end = points[i][1];
            if(end>=commonStart && start<=commonEnd){
                commonStart = Math.max(commonStart,start);
                commonEnd = Math.min(commonEnd, end);
            }
            else{
                count++;
                commonStart = start;
                commonEnd = end;
               
            }
        }
        return count;
    }
}