class Solution {
    public long getDescentPeriods(int[] prices) {
      long ans = 0, cur = 0;
    for(int i=0;i<prices.length;i++){
    if(i>0 && prices[i-1]-prices[i]==1)cur++;
    else cur=1;
    ans+=cur;
    }
    return ans;

    }
}