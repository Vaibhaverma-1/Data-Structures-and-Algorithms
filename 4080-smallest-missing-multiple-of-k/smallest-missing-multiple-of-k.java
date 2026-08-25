class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        for(int i=k; i<=200; i+=k){
            if(!set.contains(i)){
                return i;
            }
        }
        return -1;
    }
}