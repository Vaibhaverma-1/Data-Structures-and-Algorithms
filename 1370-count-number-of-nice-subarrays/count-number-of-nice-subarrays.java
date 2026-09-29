class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int odd = 0, n = nums.length, count = 0;
        int j = 0, i = 0;

        while(j < n) {
            if(nums[j] % 2 != 0) odd++;

            while(odd > k) {
                if(nums[i] % 2 != 0) odd--;
                i++;
            }

            if(odd == k) {
                int temp = i;
                while(temp <= j && nums[temp] % 2 == 0) {
                    count++;
                    temp++;
                }
                count++;
            }

            j++;
        }

        return count;
    }
}