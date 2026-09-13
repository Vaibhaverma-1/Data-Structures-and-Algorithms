class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n=img1.length;
        ArrayList<int[]> one1=new ArrayList<>();
        ArrayList<int[]> one2=new ArrayList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(img1[i][j]==1){
                    one1.add(new int[]{i,j});
                }
                if(img2[i][j]==1){
                    one2.add(new int[]{i,j});
                }
            }
        }

        HashMap<String,Integer> map=new HashMap<>();
        int max=0;

        for(int[] a:one1){
            for(int[] b:one2){
                int rowShift=b[0]-a[0];
                int colShift=b[1]-a[1];

                String key=rowShift+","+colShift;

                map.put(key,map.getOrDefault(key,0)+1);
                max=Math.max(max,map.get(key));
            }
        }

        return max;
    }
}