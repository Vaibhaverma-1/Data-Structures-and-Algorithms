class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxArea =Integer.MIN_VALUE;
       int l =0, r=n-1;
       while(l<=r){
        int area = Math.min(height[l], height[r])*(r-l);
        maxArea= Math.max(area, maxArea);
        if(height[l]<=height[r]){
            l++;

        }
        else{
            r--;
        }
       }
        return maxArea;
    }
}