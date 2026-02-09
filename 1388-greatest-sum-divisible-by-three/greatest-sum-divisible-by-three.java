class Solution {
    public int maxSumDivThree(int[] nums) {
        int sum = 0;
        int n = nums.length;

        int smallestOne = Integer.MAX_VALUE, ssmallestOne = Integer.MAX_VALUE;
        int smallestTwo = Integer.MAX_VALUE, ssmallestTwo = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int val = nums[i] % 3;

            if (val == 1) {
                if (nums[i] <= smallestOne) {
                    ssmallestOne = smallestOne;
                    smallestOne = nums[i];
                } else if (nums[i] < ssmallestOne) {
                    ssmallestOne = nums[i];
                }
            }

            if (val == 2) {
                if (nums[i] <= smallestTwo) {
                    ssmallestTwo = smallestTwo;
                    smallestTwo = nums[i];
                } else if (nums[i] < ssmallestTwo) {
                    ssmallestTwo = nums[i];
                }
            }

            sum += nums[i];
        }

        int r = sum % 3;
        if (r == 0) return sum;

        int min = Integer.MAX_VALUE;

        if (r == 1) {
            // option 1: remove one mod-1
            if (smallestOne != Integer.MAX_VALUE) {
                min = smallestOne;
            }
            // option 2: remove two mod-2
            if (smallestTwo != Integer.MAX_VALUE && ssmallestTwo != Integer.MAX_VALUE) {
                min = Math.min(min, smallestTwo + ssmallestTwo);
            }
        } else { // r == 2
            // option 1: remove one mod-2
            if (smallestTwo != Integer.MAX_VALUE) {
                min = smallestTwo;
            }
            // option 2: remove two mod-1
            if (smallestOne != Integer.MAX_VALUE && ssmallestOne != Integer.MAX_VALUE) {
                min = Math.min(min, smallestOne + ssmallestOne);
            }
        }

        return sum - min;
    }
}
