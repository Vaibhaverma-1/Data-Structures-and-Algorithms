class Solution {
    public long gcdSum(int[] nums) {
        int mx=nums[0];
        int n = nums.length;
        long ans=0;
        int[] prefix = new int[n];
        for(int i=0; i<n; i++){
            mx = Math.max(mx,nums[i]);
            prefix[i] = gcd(mx,nums[i]);
        }
        Arrays.sort(prefix);
        boolean even = n%2==0?true:false;
        for(int i=0; i<n/2; i++){
            ans += gcd(prefix[i],prefix[n-i-1]);
        }
        return ans;
    }

    int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}
}