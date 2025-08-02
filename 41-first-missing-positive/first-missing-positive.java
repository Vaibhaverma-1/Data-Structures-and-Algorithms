class Solution {
    public int firstMissingPositive(int[] nums) {

          Set<Integer> set = new HashSet<>();
        for (int v : nums) if (v > 0) set.add(v);
        int x = 1;
        while (set.contains(x)) x++;
        return x;

        
    }
}