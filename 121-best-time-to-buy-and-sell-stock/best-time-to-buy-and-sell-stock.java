class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int min=prices[0];

        for(int i = 1; i < prices.length ; i++)
        {
            if(maxProfit <prices[i]-min)
               maxProfit = prices[i]-min;
            if(min>prices[i])
            min =prices[i];
            
        }
        return maxProfit;
    }
}