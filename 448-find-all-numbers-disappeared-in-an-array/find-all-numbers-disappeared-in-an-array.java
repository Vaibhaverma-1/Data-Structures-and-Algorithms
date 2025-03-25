class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        int[] hashset= new int[n+1];
        for(int i=0; i<n; i++){
            hashset[nums[i]]++;
        }
        for(int i=1; i<=n; i++){
            if(hashset[i]==0){
                list.add(i);
            }
        }
        return list;
    }
}