class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int increases =0;
        int decreases =0;
        int rotations=0;
        int index=0;
        for(int i=0; i<n; i++){
            int next = (i+1)%n;
            if(nums[i]==0) index=i;

            if(nums[i]>nums[next]){
                decreases++;
                rotations=(i+1)%n;
            }

            if(nums[i]<nums[next]) increases++;
        }
        if(n<=2) return index;
        if(increases>1 && decreases>1) return -1;
        if(increases>1) return Math.min(rotations, n-rotations+2);
        return 1+Math.min(index+1,n-1-index);

        
        
    }
}