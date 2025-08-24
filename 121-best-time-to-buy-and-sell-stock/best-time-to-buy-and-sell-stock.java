class Solution {
    public int maxProfit(int[] prices) {
        return helper(0, prices[0], 0, prices);
    }

    private int helper(int idx, int buy, int profit, int[] prices) {
        // Base case
        if (idx == prices.length) return profit;

        // Always update min price first
        if (prices[idx] < buy) {
            buy = prices[idx];
        }

        // Calculate profit if we sell today
        profit = Math.max(profit, prices[idx] - buy);

        // Move to next day with updated buy and profit
        return helper(idx + 1, buy, profit, prices);
    }
}
