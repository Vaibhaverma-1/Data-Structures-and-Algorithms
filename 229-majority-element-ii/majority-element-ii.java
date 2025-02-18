import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> result = new ArrayList<>();

        if (n == 0) {
            return result;
        }

        int min = findMin(nums);
        int max = findMax(nums);
        int[] frequency = new int[max - min + 1];

        for (int num : nums) {
            frequency[num - min]++;
        }

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > n / 3) {
                result.add(i + min);
            }
        }

        return result;
    }

    private int findMin(int[] nums) {
        int min = nums[0];
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    private int findMax(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}