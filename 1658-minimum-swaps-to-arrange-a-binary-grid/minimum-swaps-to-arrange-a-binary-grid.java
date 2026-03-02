class Solution {
    public int minSwaps(int[][] grid) {
    int n = grid.length;
    int[] maxRight = new int[n];
    for (int i = 0; i < n; i++) {
        int count = 0;
        for (int j = n - 1; j >= 0; j--) {
            if (grid[i][j] == 0) count++;
            else break;
        }
    maxRight[i] = count;
    }
    int swap=0;

    for(int i=0; i<n; i++){
        int required = n-i-1;
           if(maxRight[i]<required){
            int k= i;
            while(k<n && maxRight[k]<required){
                k++;
            }
            if(k==n ||maxRight[k]<required){
                return -1;
            }
        while (k > i) {
            int temp = maxRight[k];
            maxRight[k] = maxRight[k - 1];
            maxRight[k - 1] = temp;
            k--;
            swap++;
            }
           }
    }
    return swap;
    
    }
}