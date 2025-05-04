class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < dominoes.length; i++) {
            int a = dominoes[i][0];
            int b = dominoes[i][1];

            // ⚠️ Normalize the domino so [1,2] and [2,1] become same key
            int key = a <= b ? a * 10 + b : b * 10 + a;

            if (map.containsKey(key)) {
                count += map.get(key); // add existing pairs
                map.put(key, map.get(key) + 1); // increment count
            } else {
                map.put(key, 1); // first occurrence
            }
        }

        return count;
    }
}
