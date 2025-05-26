import java.util.*;

class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int[] pse = findPSEE(arr); // Previous Smaller or Equal Element
        int[] nse = findNSEE(arr); // Next Smaller Element

        long total = 0;
        int mod = (int) 1e9 + 7;

        for (int i = 0; i < n; i++) {
            int left = i - pse[i];   // Number of elements on the left including arr[i]
            int right = nse[i] - i;  // Number of elements on the right including arr[i]
            total = (total + (long) left * right * arr[i]) % mod;
        }

        return (int) total;
    }

    // Previous Smaller or Equal Element
    private int[] findPSEE(int[] arr) {
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

    // Next Smaller Element
    private int[] findNSEE(int[] arr) {
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
}
