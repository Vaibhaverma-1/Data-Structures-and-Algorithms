class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count=0,n=nums.length;
        int sum=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0; i<n; i++){
            sum+=nums[i];
            int val = ((sum%k)+k)%k;
            if(map.containsKey(val)){
                count+=map.get(val);
            }
            map.put(val,map.getOrDefault(val,0)+1);
        }
        return count;
    }
}