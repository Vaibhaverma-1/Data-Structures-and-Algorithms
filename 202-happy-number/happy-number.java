class Solution {
    public boolean isHappy(int n) {
        int slow = n, fast = n;

        while (true) {
            slow = sqSum(slow);
            fast = sqSum(sqSum(fast));

            if (slow == 1 || fast == 1) return true;
            if (fast == slow) return false;
        }
    }

    int sqSum(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }
}