class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]%2==0){
                nums[i]=0;
            }
            else{
                nums[i]=1;
            }
        }

         int cumSum = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // Base case: prefix sum 0 appears once

        for (int r = 0; r < nums.length; r++) {
            cumSum += nums[r];

            if (map.containsKey(cumSum - k)) {
                count += map.get(cumSum - k);
            }

            map.put(cumSum, map.getOrDefault(cumSum, 0) + 1);
        }

        return count;
        
    }
}