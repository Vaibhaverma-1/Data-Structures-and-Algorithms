import java.util.*;

public class Solution {
    // Main method to calculate sum of all subarray ranges
    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        long total = 0;

        // Precompute next/previous greater and smaller elements
        int[] nextGreater = nextGreaterElement(nums);
        int[] prevGreater = prevGreaterElement(nums);
        int[] nextSmaller = nextSmallerElement(nums);
        int[] prevSmaller = prevSmallerElement(nums);

        // Calculate contribution of each element as max and min in subarrays
        for (int i = 0; i < n; i++) {
            long maxCount = (long)(i - prevGreater[i]) * (nextGreater[i] - i);
            long minCount = (long)(i - prevSmaller[i]) * (nextSmaller[i] - i);
            total += (maxCount - minCount) * nums[i];
        }

        return total;
    }

    // Find next greater element index for each element
    private int[] nextGreaterElement(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            res[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }
        return res;
    }

    // Find previous greater element index for each element
    private int[] prevGreaterElement(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                stack.pop();
            }
            res[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        return res;
    }

    // Find next smaller element index for each element
    private int[] nextSmallerElement(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            res[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }
        return res;
    }

    // Find previous smaller element index for each element
    private int[] prevSmallerElement(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            res[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        return res;
    }
}
