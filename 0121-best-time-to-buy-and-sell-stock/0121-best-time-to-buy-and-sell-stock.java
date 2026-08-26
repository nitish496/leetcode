class Solution {

    public int maxProfit(int[] prices) {

        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for (int i = 0; i < prices.length; i++) {

            int currentprice = prices[i];

            if (currentprice < minprice) {
                minprice = currentprice;
            }

            int profittoday = currentprice - minprice;

            if (profittoday > maxprofit) {
                maxprofit = profittoday;
            }
        }

        return maxprofit;
    }
}
