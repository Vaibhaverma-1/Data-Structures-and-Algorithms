class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int[] topsval = findFreq(tops);
        int[] bottomsval = findFreq(bottoms);

        // ✅ Pick the better candidate (higher frequency)
        int val = topsval[1] > bottomsval[1] ? topsval[0] : bottomsval[0];

        // ✅ Check if it's possible to make all elements equal to val
        int rotateTop = 0, rotateBottom = 0;
        for (int i = 0; i < tops.length; i++) {
            if (tops[i] != val && bottoms[i] != val) {
                return -1; // ✅ If neither side has the value, it's impossible
            }

            // ✅ Count rotations needed
            if (tops[i] != val) rotateTop++;
            if (bottoms[i] != val) rotateBottom++;
        }

        // ✅ Return minimum of the two rotation options
        return Math.min(rotateTop, rotateBottom);
    }

    // ✅ Returns [number, frequency] for most frequent element
    int[] findFreq(int[] arr) {
        int[] freq = new int[7]; // Values 1 to 6 possible
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        int[] val = new int[2]; // [number, frequency]
        val[0] = -1;
        val[1] = Integer.MIN_VALUE;

        for (int i = 1; i <= 6; i++) {
            if (freq[i] > val[1]) {
                val[0] = i;
                val[1] = freq[i];
            }
        }

        return val;
    }
}
