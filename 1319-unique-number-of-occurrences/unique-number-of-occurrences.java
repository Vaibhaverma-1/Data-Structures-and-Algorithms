class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] hashset  = new int[2005];
        HashSet<Integer> set = new HashSet<>();
        int n = arr.length;
        for(int i=0; i<n; i++){
            hashset[arr[i] + 1000]++;
            set.add(arr[i]);
        }
        HashSet<Integer> set2 = new HashSet<>();
        for(Integer val: set){
            if(set2.contains(hashset[val+1000])){
                return false;
            }
            set2.add(hashset[val+1000]);
        } 
        return true;
     }
}