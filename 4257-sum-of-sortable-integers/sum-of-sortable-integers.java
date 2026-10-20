class Solution {
    public int sortableIntegers(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> divisors=new ArrayList<>();
        boolean ans=true;
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]) ans=false;
        }
        for(int i=1;i<=n;i++){
            if(n%i==0) divisors.add(i);
        }
        int sum=0;
        if(ans){
            for(int k:divisors) sum+=k;
            return sum;
        }
        for(int k:divisors){
            int prevMax=Integer.MIN_VALUE;
            boolean valid=true;
            for(int start=0;start<n;start+=k){
                int decreases=0;
                int currMin=Integer.MAX_VALUE;
                int currMax=Integer.MIN_VALUE;
                for(int j=start;j<start+k;j++){
                    int next=(j==start+k-1)?start:j+1;
                    if(nums[j]>nums[next]) decreases++;
                    currMin=Math.min(currMin,nums[j]);
                    currMax=Math.max(currMax,nums[j]);
                }
                if(decreases>1 || prevMax>currMin){
                    valid=false;
                    break;
                }
                prevMax=currMax;
            }
            if(valid) sum+=k;
        }
        return sum;
    }
}