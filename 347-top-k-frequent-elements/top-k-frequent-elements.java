import java.util.Arrays;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        // frequency array with offset by 'min' to handle negatives
        int[] arr = new int[max - min + 1];
        Arrays.fill(arr, 0);

        for (int i = 0; i < n; i++) {
            arr[nums[i] - min]++;  // offset index
        }

        // pick the top k by repeatedly taking the current max frequency
        for (int j = 0; j < k; j++) {
            int frequent = Integer.MIN_VALUE;
            int pos = -1;
            // scan all frequencies to find the current maximum
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > frequent) {
                    frequent = arr[i];
                    pos = i;
                }
            }
            // map back from offset index to original value
            ans[j] = pos + min;
            // invalidate this entry so it won't be picked again
            arr[pos] = Integer.MIN_VALUE;
        }

        return ans;
    }
}
