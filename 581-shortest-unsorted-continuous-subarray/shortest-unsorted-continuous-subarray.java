class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n=nums.length;
        int i=0,j=n-1,left=-1,right=-1,maxL=Integer.MIN_VALUE,minR=Integer.MAX_VALUE;
        if(n==0) return 0;
        while(i<n && j>-1){
            if(nums[i]>=maxL){
                maxL=nums[i];
            }
            else{
                right =i;
            }        
            i++;
            if(nums[j]<=minR){
                minR=nums[j];
            }
            else{
                left=j;
            }
            j--;
        }
        return (left==-1 && right==-1)?0:right-left+1;
    }
}