class Solution {
    //fixed window problem
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int total=0;
        for(int i=0; i<n; i++){
            total+=cardPoints[i];
        }
        if(n==k) return total;
        int left=0;
        int current=0;
        int ans = Integer.MIN_VALUE;
        for(int right=0; right<n; right++){
            current+=cardPoints[right];
            while(right-left+1>n-k){
                current-=cardPoints[left];
                left++;
            }
            if(right-left+1==n-k){
                ans = Math.max(ans, total-current);
            }
        }
        return ans;

        
    }
}