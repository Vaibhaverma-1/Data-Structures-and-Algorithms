class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n=nums.length,sum=0;
        int count=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0; i<n; i++){
            int val = (nums[i]%2==0)?0:1;
            sum+=val;
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }

        return count;
    }
}