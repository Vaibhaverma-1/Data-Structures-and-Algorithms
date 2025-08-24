class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit=0;
        for(int i=0; i<prices.length; i++){
            buy = Math.min(prices[i], buy);
            profit = Math.max(prices[i]-buy, profit);
        }
        return profit;
        
    }
}