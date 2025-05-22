class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            int num = nums1[i];
            int j = 0;

            // Find the index of nums1[i] in nums2
            while (j < nums2.length && nums2[j] != num) {
                j++;
            }

            // Scan to the right for the next greater element
            int nextGreater = -1;
            for (int k = j + 1; k < nums2.length; k++) {
                if (nums2[k] > num) {
                    nextGreater = nums2[k];
                    break;
                }
            }

            ans[i] = nextGreater;
        }

        return ans;
    }
}
