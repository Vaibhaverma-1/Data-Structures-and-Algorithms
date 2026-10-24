class Solution {
    public int subarraysWithKDistinct(int[] nums,int k) {
        return atMost(nums,k)-atMost(nums,k-1);
    }

    int atMost(int[] nums,int k){
        int n=nums.length;
        int[] freq=new int[n+1];
        int i=0,count=0,distinct=0;

        for(int j=0;j<n;j++){
            if(freq[nums[j]]==0) distinct++;
            freq[nums[j]]++;

            while(distinct>k){
                freq[nums[i]]--;
                if(freq[nums[i]]==0) distinct--;
                i++;
            }

            count+=j-i+1;
        }
        return count;
    }
}