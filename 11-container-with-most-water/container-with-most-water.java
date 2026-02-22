class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int n = height.length;
        int i=0,j=n-1;
        int min =-1;
        while(i<j){
            if(height[i]>=height[j]){
                max = Math.max(max, (j-i)*height[j]);
                j--;
            }
            else{
                max=Math.max(max, (j-i)*height[i]);
                i++;
            }
        }
        return max;
    }
}