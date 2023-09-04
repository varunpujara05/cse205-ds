class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) return 0;
        return Max_Profit(prices, 0, Integer.MAX_VALUE, 0);
    }
    
    public int Max_Profit(int[] prices, int i, int min_stock_price, int max_diff) {
        if(prices.length == i) {
            return max_diff;
        }
         int earn =  prices[i] - min_stock_price;
         max_diff = Math.max(earn, max_diff);
         min_stock_price = Math.min(min_stock_price, prices[i]);
        return Max_Profit(prices,++i, min_stock_price, max_diff);
    }
}