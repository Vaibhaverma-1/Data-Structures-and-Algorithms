class Solution {
    public boolean stoneGameIX(int[] stones) {

        int n = stones.length;
        int count = 0, sum = 0;

        int[] category = new int[3];

        for (int i = 0; i < n; i++) {
            if (stones[i] % 3 == 0)
                category[0]++;
            else if (stones[i] % 3 == 1)
                category[1]++;
            else
                category[2]++;
        }

        category[0] = category[0] % 2;

        if (category[0] == 0) {
            return category[1] != 0 && category[2] != 0;
        }

        return Math.abs(category[1] - category[2]) > 2;
    }
}