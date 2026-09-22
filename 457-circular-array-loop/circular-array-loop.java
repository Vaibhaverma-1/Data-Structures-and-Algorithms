class Solution {
    public boolean circularArrayLoop(int[] nums) {
        int n=nums.length;
        for(int i=0; i<n; i++){
            int slow=i;
            int fast=i;
            boolean dir =nums[i]>0?true:false;
            while(((nums[slow]>0)==dir)&&((nums[fast]>0)==dir)){
                if((nums[slow]>0)!=dir) break;
                slow=nextIndex(slow,nums);
                if ((nums[fast] > 0) != dir) break;
                fast = nextIndex(fast,nums);
                if((nums[fast]>0)!=dir)break;
                fast = nextIndex(fast,nums);
                if(slow==fast){
                    if(nextIndex(slow,nums)==slow)break;
                    return true;
                }
            }
        }
        return false;
      
    }
    int nextIndex(int index, int[] nums){
        int n = nums.length;
        return ((index+nums[index])%n +n)%n;

    }
}