class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int original = image[sr][sc];
        Queue<int[]> q = new ArrayDeque<>();
        if(original==color) return image;
        int n = image.length;
        int m = image[0].length;
        image[sr][sc]=color;
        q.offer(new int[]{sr,sc});
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int r =curr[0];
            int c =curr[1];
            //for all 4 directions
            //up
            int up =r-1;
            if(0<=up && up<n && 0<=c && c<m && image[up][c]==original){
                image[up][c]=color;
                q.offer(new int[]{up,c});
            }
            //down
            int down = r+1;
            if(0<=down && down<n && 0<=c && c<m && image[down][c]==original){
                image[down][c]=color;
                q.offer(new int[]{down,c});
            }
            //left
            int left = c-1;
            if(0<=r && r<n && 0<=left && left<m && image[r][left]==original){
                image[r][left]=color;
                q.offer(new int[]{r,left});
            }
            //right
            int right = c+1;
            if(0<=r && r<n && 0<=right && right<m && image[r][right]==original){
                image[r][right]=color;
                q.offer(new int[]{r,right});
            }
        }
        return image;
    
    }
}