class Solution {
    public static int numberOfSubarrays(int[] nums, int k) {
        int len = nums.length, res = 0, sum = 0;
        if (len == 0)
            return 0;
        int[] arr= new int[len+1];
        arr[0]++;
        for (int i = 0; i < len; i++) {
            sum += nums[i]%2;
              if (sum - k >= 0) res += arr[sum - k];
            arr[sum]++;
        }
        return res;
    }
    static{
        int[] nums = { 2, 2, 2, 1, 2, 2, 1, 2, 2, 2 };
        for (int i = 0; i < 200; i++) {
numberOfSubarrays(nums,2);
        }
    }
}