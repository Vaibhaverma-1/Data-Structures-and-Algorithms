class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count=0;
        int sum=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1); // sum and count is put here
        for(int i=0; i<n; i++){
            sum+=nums[i];
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            int freq=0;
            if(map.containsKey(sum)){
                 freq=map.get(sum);
            }
            freq++;
            map.put(sum,freq);
            
        }
        return count;
    }
}