class Solution {
    public int minimumDeletions(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minInd=-1,maxInd=-1;
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(min>nums[i]){
                min = nums[i];
                minInd =i;
            }
            if(max<nums[i]){
                max=nums[i];
                maxInd=i;
            }
        }
        

        int left = Math.max(minInd, maxInd) + 1;

int right = n - Math.min(minInd, maxInd);

int bothSides =
        Math.min(minInd, maxInd) + 1
        + n - Math.max(minInd, maxInd);

return Math.min(left, Math.min(right, bothSides));
    }
}