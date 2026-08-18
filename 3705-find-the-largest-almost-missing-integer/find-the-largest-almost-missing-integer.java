class Solution {
    public int largestInteger(int[] nums, int k) {
        int[] set = new int[51];
        int n =nums.length;
        for(int i=0; i<n; i++){
            set[nums[i]]++;
        }
        if(k==1){
            for(int i=50; i>=0; i--){
                if(set[i]==1){
                    return i;
                }
            }
        }
        if(k==n){
            for(int i=50; i>=0; i--){
                if(set[i]!=0){
                    return i;
                }
            }
        }
        if(set[nums[n-1]]>1 && set[nums[0]]>1) return -1;
        if(set[nums[0]]==1 && set[nums[n-1]]==1) return nums[0]>=nums[n-1]?nums[0]:nums[n-1];
        else if(set[nums[0]]>set[nums[n-1]]) return nums[n-1];
        else if(set[nums[n-1]]>set[nums[0]]) return nums[0];

        
        return -1;


    }
}