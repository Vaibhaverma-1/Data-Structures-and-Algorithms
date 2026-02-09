class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int sum=0;
        int count=0;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0; i<n; i++){
            int freq=0;
            sum+=nums[i];
            if(map.containsKey(sum)){
                freq=map.get(sum);
            }
             freq++;
            if(map.containsKey(sum-k)){
                
                int f=map.get(sum-k);
                count+=f;
            }
           map.put(sum,freq);
        }
        return count;
    }
}