class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maxProd=1, minProd=1;
        int ans =Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int a = maxProd * nums[i];
            int b = minProd * nums[i];
            maxProd = Math.max(a, Math.max(b,nums[i]));
            minProd = Math.min(a, Math.min(b,nums[i]));
            ans = Math.max(ans, maxProd);
            System.out.println(" max: "+ maxProd);
            System.out.println();
            System.out.print("min: "+ minProd);
        }
        return ans;
    }
}