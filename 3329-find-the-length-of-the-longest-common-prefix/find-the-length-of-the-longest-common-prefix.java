class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {

        HashSet<Integer> set = new HashSet<>();

        // Store all prefixes from arr1
        for (int num : arr1) {

            while (num > 0) {
                set.add(num);
                num /= 10;
            }
        }

        int ans = 0;

        // Check prefixes in arr2
        for (int num : arr2) {

            while (num > 0) {

                if (set.contains(num)) {

                    ans = Math.max(ans,
                            String.valueOf(num).length());

                    break;
                }

                num /= 10;
            }
        }

        return ans;
    }
}