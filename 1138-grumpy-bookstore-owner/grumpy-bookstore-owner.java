class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length;
        int left=0;
        int sum=0;
        int perma=0;
        for(int i=0;i<n; i++){
            if(grumpy[i]==0){
                perma+=customers[i];
            }
        }
        int ans = perma;
        for(int right=0; right<n; right++){
           
             if(grumpy[right]==1) sum+=customers[right];
            while(right-left+1>minutes){
                if(grumpy[left]!=0){
                    sum-=customers[left];
                }
                left++;
            }
            if(right-left+1==minutes){
                ans = Math.max(ans, perma+sum);
            }
        }
        return ans;
    }
}