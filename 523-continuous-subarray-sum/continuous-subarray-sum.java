class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length,sum=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i=0; i<n; i++){
            sum+=nums[i];
            int val = ((sum%k)+k)%k;
            if(map.containsKey(val)){
                if((i-map.get(val))>=2) return true;
            }
            else
            {
            map.put(val,i);
            }
        }
        return false;
    }
}