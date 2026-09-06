class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int ans=Integer.MIN_VALUE;
        int diff = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    int sum = nums[i]+nums[j]+nums[k];
                    if(Math.abs(target-sum)<diff){
                        diff=Math.abs(target-sum);
                        ans=sum;
                    }
                }
            }
        }
        return ans;
    }
}