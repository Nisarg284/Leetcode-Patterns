package Leetcode;

// leetcode 122: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
public class BuyAndSellStock2 {

    public static int bestTimeToBuyAndSell(int[] prices) {
        int n = prices.length;

        boolean isBuy = false;
        int maxProfit = 0;
        int buyingPrice = -1;

        // now iterate over the prices[] array
        for(int i=0; i<n-1;i++)
        {
            int j = i+1;

            // Buying Condition
            if(prices[i] < prices[j] && !isBuy)
            {
                buyingPrice = prices[i];
                isBuy = true;
            }

            // Selling Condition
            if(prices[i] > prices[j] && isBuy)
            {
                int currentProfit = prices[i] - buyingPrice;
                maxProfit += currentProfit;
                buyingPrice = -1;
                isBuy = false;
            }
        }

        if(isBuy)
        {
            maxProfit += prices[n-1] - buyingPrice;
        }

        return maxProfit;
    }
    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};

        int maxProfit = bestTimeToBuyAndSell(prices);
        System.out.println(maxProfit);

    }
}
