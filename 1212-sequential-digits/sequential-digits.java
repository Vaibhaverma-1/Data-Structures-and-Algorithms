class Solution {
    public List<Integer> sequentialDigits(int low, int high) {

        ArrayList<Integer> list = new ArrayList<>();

        int lower = countDig(low);
        int higher = countDig(high);

        for (int len = lower; len <= higher; len++) {

            int first;

            if (len == lower)
                first = firstDigit(low);
            else
                first = 1;

            if (first + len - 1 > 9)
                continue;

            int num = 0;
            int digit = first;

            while (digit < first + len) {
                num = num * 10 + digit;
                digit++;
            }

            int add = 0;
            for (int i = 0; i < len; i++)
                add = add * 10 + 1;

            while (num < low && num % 10 != 9)
                num += add;

            while (num <= high && isSequential(num)) {
                if (num >= low)
                    list.add(num);
                num += add;
            }
        }

        return list;
    }

    public int firstDigit(int num) {
        while (num >= 10)
            num /= 10;
        return num;
    }

    public boolean isSequential(int num) {
        int prev = 10;

        while (num > 0) {
            int curr = num % 10;
            if (prev != 10 && prev - curr != 1)
                return false;
            prev = curr;
            num /= 10;
        }

        return true;
    }

    public int countDig(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}