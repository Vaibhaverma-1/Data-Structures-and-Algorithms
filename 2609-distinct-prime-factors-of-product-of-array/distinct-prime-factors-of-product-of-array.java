class Solution {
    public int distinctPrimeFactors(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int rem = nums[i];
            for (int div = 2; div * div <= rem; div++) {
                    while (rem % div == 0) {
                        set.add(div);
                        rem /= div;
                    }
            }
            if (rem > 1) {
                set.add(rem);
            }
        }
        return set.size();
    }
}
