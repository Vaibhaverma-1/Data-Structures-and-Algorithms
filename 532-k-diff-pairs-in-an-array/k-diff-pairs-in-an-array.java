class Solution {
    public int findPairs(int[] nums, int k) {
        if(k < 0) return 0;

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for(int num : nums){
            if(seen.contains(num - k)){
                result.add(num);
            }
            if(seen.contains(num + k)){
                result.add(num + k);
            }
            seen.add(num);
        }

        return result.size();
    }
}