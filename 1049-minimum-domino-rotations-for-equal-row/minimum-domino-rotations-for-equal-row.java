class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        // Find the most frequent number in tops and bottoms
        int[] topsval = findFreq(tops);
        int[] bottomsval = findFreq(bottoms);

        // Choose the number with higher frequency as the candidate
        int val = topsval[1] > bottomsval[1] ? topsval[0] : bottomsval[0];

        int rotateTop = 0, rotateBottom = 0;

        // Check if it's possible to make all values in either tops or bottoms equal to the chosen number
        for (int i = 0; i < tops.length; i++) {
            // If the number doesn't exist in either top or bottom at any index, it's impossible
            if (tops[i] != val && bottoms[i] != val) {
                return -1;
            }

            // Count how many rotations are needed for tops and bottoms separately
            if (tops[i] != val) rotateTop++;
            if (bottoms[i] != val) rotateBottom++;
        }

        // Return the minimum number of rotations needed
        return Math.min(rotateTop, rotateBottom);
    }

    // This function returns the number with the highest frequency in the array along with its count
    int[] findFreq(int[] arr) {
        int[] freq = new int[7]; // Index 1 to 6 corresponds to possible domino face values
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        int[] val = new int[2]; // val[0] = number, val[1] = frequency
        val[0] = -1;
        val[1] = Integer.MIN_VALUE;

        // Find the number with the highest frequency from 1 to 6
        for (int i = 1; i <= 6; i++) {
            if (freq[i] > val[1]) {
                val[0] = i;
                val[1] = freq[i];
            }
        }

        return val;
    }
}
