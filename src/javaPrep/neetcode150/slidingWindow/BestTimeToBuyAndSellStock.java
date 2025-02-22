package javaPrep.neetcode150.slidingWindow;

public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {

        if (prices == null || prices.length <= 1) {
            return 0;
        }

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            int currentPrice = prices[i];
            int currentProfit = currentPrice - minPrice;

            maxProfit = Math.max(maxProfit, currentProfit);
            minPrice = Math.min(minPrice, currentPrice);
        }

        return maxProfit;

//        int buyPrice = Integer.MAX_VALUE;
//        int sellPrice = 0;
//
//        for(int i = 0; i<prices.length; i++) {
//
//            if(prices[i] < buyPrice) {
//                buyPrice = prices[i];
//            } else {
//                int profit = prices[i] - buyPrice;
//                if ( profit > sellPrice)
//                    sellPrice = profit;
//            }
//        }
//
//        return sellPrice;

    }

    public static void main(String[] args) {

        int[] days1 = {7, 1, 5, 3, 6, 4};

        System.out.println (maxProfit ( days1 ));
    }

}
