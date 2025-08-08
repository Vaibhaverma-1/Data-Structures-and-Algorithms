import java.util.*;

class Solution {
    public String largestNumber(int[] nums) {
        // Step 1: Convert int[] to String[]
        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        // Step 2: Sort using custom comparator
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        // Step 3: If largest number is 0, return "0"
        if (arr[0].equals("0")) {
            return "0";
        }

        // Step 4: Build final result
        StringBuilder result = new StringBuilder();
        for (String s : arr) {
            result.append(s);
        }

        return result.toString();
    }
}
