class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = Integer.MIN_VALUE;
        int diff = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            int j=i+1,k=n-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                int d = Math.abs(sum-target);
                if(sum==target){
                    return target;
                }
                else if(sum<target){
                    if(diff>d){
                        diff=d;
                        ans=sum;
                    }
                    j++;
                }
                else{
                    if(diff>d){
                        diff=d;
                        ans=sum;
                    }
                    k--;
                }
            }

        }
        return ans;
    }
}