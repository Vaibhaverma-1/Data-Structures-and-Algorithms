class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>list = new ArrayList<>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1,k=n-1;
            while(j<k){
               if(nums[i]+nums[j]+nums[k]==0){
                ArrayList<Integer>ans = new ArrayList<>();
                ans.add(nums[i]);
                ans.add(nums[j]);
                ans.add(nums[k]);
                list.add(ans);
                j++;
                k--;
                while(j<n && nums[j]==nums[j-1]){
                j++;
            }
               while(k<n-1 && k>0 && nums[k]==nums[k+1]){
                k--;
            }
                
               }
               else if(nums[i]+nums[j]+nums[k]>0){
                k--;
               }
               else{
                j++;
               }
                
            }

        }
        return list;
    }
}