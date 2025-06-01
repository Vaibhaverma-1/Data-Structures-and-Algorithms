import java.util.Arrays;

class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]); // sort by units per box descending
        int total = 0;
        int i = 0;

        while (truckSize > 0 && i < boxTypes.length) {
            if (boxTypes[i][0] <= truckSize) {
                truckSize -= boxTypes[i][0];
                total += boxTypes[i][0] * boxTypes[i][1];
            } else {
                total += truckSize * boxTypes[i][1];
                truckSize = 0; // important to avoid infinite loop
            }
            i++;
        }

        return total;
    }
}
