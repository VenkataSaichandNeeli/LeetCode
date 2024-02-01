class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int whenBuy = 0;
        for(int i = 0; i < prices.length; i++)
        {
            int profit = prices[i] - prices[whenBuy];
            if(prices[whenBuy] > prices[i])
            {
                whenBuy = i;
            }
            maxprofit = Math.max(profit,maxprofit);
        }
        return maxprofit;
        
    }
}
