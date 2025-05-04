class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        // ⚠️ Removed incorrect initial put — we don't need to pre-add the first domino
        for (int i = 0; i < dominoes.length; i++) {
            int a = dominoes[i][0];
            int b = dominoes[i][1];

            // ⚠️ Create a normalized key (min, max) to handle [1,2] and [2,1]
            int key = a <= b ? a * 10 + b : b * 10 + a;

            // Check if the normalized domino already exists
            if (map.containsKey(key)) {
                count += map.get(key); // Add all existing matches
                map.put(key, map.get(key) + 1); // Increment its count
            } else {
                map.put(key, 1); // Add first occurrence
            }
        }

        return count;
    }
}
