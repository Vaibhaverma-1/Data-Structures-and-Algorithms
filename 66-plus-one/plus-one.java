class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry = 1; // Start with 1 because we are adding one

        for (int i = n - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            if (sum > 9) {
                digits[i] = 0; // Set to 0 and continue carry
                carry = 1;
            } else {
                digits[i] = sum;
                carry = 0;
                break; // No need to continue if there's no carry
            }
        }

        // If carry is still 1, we need an extra digit at the front
        if (carry == 1) {
            int[] newDigits = new int[n + 1];
            newDigits[0] = 1; // The first digit becomes 1
            return newDigits;
        }

        return digits;
    }}