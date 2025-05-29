class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int maxCap = 0;

        while (l < r) {
            int h = Math.min(height[l], height[r]);
            int width = r - l;
            maxCap = Math.max(maxCap, h * width);

            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }

        return maxCap;
    }
}
