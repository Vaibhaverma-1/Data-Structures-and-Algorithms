class Solution {
    public int largestOverlap(int[][] img1,int[][] img2) {
        int n=img1.length;
        ArrayList<int[]> one1=new ArrayList<>();
        ArrayList<int[]> one2=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(img1[i][j]==1) one1.add(new int[]{i,j});
                if(img2[i][j]==1) one2.add(new int[]{i,j});
            }
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        for(int[] a:one1){
            for(int[] b:one2){
                int row=b[0]-a[0];
                int col=b[1]-a[1];
                int key=(row+n)*(2*n-1)+(col+n-1);
                int count=map.getOrDefault(key,0)+1;
                map.put(key,count);
                max=Math.max(max,count);
            }
        }
        return max;
    }
}