class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] C = new int[A.length];
        HashSet<Integer> set = new HashSet<>();
        int common = 0;

        for (int i = 0; i < A.length; i++) {
            if (set.contains(A[i])) {
                common++;
            }
            set.add(A[i]);

            if (set.contains(B[i])) {
                common++;
            }
            set.add(B[i]);

            C[i] = common;
        }
        return C;
    }
}