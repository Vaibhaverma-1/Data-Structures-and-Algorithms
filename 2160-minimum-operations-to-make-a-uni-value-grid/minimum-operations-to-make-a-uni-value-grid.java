class Solution {
    public int minOperations(int[][] grid, int x) {
        
        int k=0;
        int m = grid.length;
        int n = grid[0].length;
        int[] arr = new int[m*n];
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
               arr[k]=grid[i][j];
               k++;
            }
        }
        Arrays.sort(arr);
       int median =0;
       if(arr.length==1){
            return 0;
        }

        median = arr.length/2;
       
       int op=0;
       for(int i=0; i<arr.length; i++){
        if(Math.abs(arr[median]-arr[i])%x!=0){
           return -1;
        }
        else{
            op+=Math.abs(arr[median]-arr[i])/x;

        }
       }
       return op;
    }
}