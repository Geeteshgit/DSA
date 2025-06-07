package Arrays;

class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int min = prices[0];
        int maxProfit = Integer.MIN_VALUE;
        for(int i = 0; i < len; i++) {
            if(prices[i] < min) {
                min = prices[i];
            }
            int profit = prices[i] - min;
            if(profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}
