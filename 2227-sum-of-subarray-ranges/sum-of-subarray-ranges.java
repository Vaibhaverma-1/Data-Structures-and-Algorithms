import java.util.*;

public class Solution {
    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        long total = 0;

        int[] nextGreater = new int[n];
        int[] prevGreater = new int[n];
        int[] nextSmaller = new int[n];
        int[] prevSmaller = new int[n];

        // Initialize
        Arrays.fill(nextGreater, n);
        Arrays.fill(prevGreater, -1);
        Arrays.fill(nextSmaller, n);
        Arrays.fill(prevSmaller, -1);

        // Next Greater Element
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                nextGreater[stack.pop()] = i;
            }
            stack.push(i);
        }

        // Prev Greater Element
        stack.clear();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[i]) {
                prevGreater[stack.pop()] = i;
            }
            stack.push(i);
        }

        // Next Smaller Element
        stack.clear();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] > nums[i]) {
                nextSmaller[stack.pop()] = i;
            }
            stack.push(i);
        }

        // Prev Smaller Element
        stack.clear();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] >= nums[i]) {
                prevSmaller[stack.pop()] = i;
            }
            stack.push(i);
        }

        // Final Contribution Calculation
        for (int i = 0; i < n; i++) {
            long maxCount = (long)(i - prevGreater[i]) * (nextGreater[i] - i);
            long minCount = (long)(i - prevSmaller[i]) * (nextSmaller[i] - i);
            total += (maxCount - minCount) * nums[i];
        }

        return total;
    }
}
