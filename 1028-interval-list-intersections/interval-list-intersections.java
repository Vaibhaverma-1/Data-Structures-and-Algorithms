class Solution {
    public int[][] intervalIntersection(int[][] firs, int[][] sec) {
        int n = firs.length, m = sec.length;
        if(n==0||m==0) return new int[][]{};
        List<int[]> ans = new ArrayList<>();
        int i=0,j=0;
        while(i<n && j<m){
            int[] f = firs[i];
            int[] s = sec[j];
            int start = Math.max(f[0],s[0]),end= Math.min(f[1],s[1]);
            if(start<=end){
                ans.add( new int[]{start,end});
            }
            if(f[1]<s[1]){
                i++;
            }
            else{
                j++;
            }
        }
        return ans.toArray(new int[ans.size()][]);

    }
}