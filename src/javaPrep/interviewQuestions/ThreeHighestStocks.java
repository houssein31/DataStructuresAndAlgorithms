package javaPrep.interviewQuestions;

import java.util.*;//In this problem, you'll be given a list of daily stock prices, and you'll be asked to return the three stocks with the highest average price.
//
//Implement the method getTopStocks (stocks, prices) which takes as input:
//        • an array of strings (stocks), representing the considered stocks.
//        • an array of 2 dimensions (prices), representing the stock prices (inner lists) for each day (outer list).
//
//An example input would look like this:
//  ['AMZN', 'CACC', 'EOIX', "GOOG', "ORLY", "ULTA']
//  [12.81, 11.09, 12.11, 10.93, 9.83, 8.14], [10.34, 10.56, 10.14, 12.17,...
//
//Your getTopStocks method should return an array containing the names of the three stocks with the highest average value.
//The array should be sorted by decreasing average value. You're guaranteed that each stock will have a unique average value.
//
//For the above example, the correct output would be:
//        ['GOOG', ' ORLY', 'AMZN']

public class ThreeHighestStocks {

    public static String[] getTopStocks(String[] stocks, float[][] prices) {

        Map<String, Float> avgMap = new HashMap<>();


        for(int i = 0; i < prices.length; i++) {
            float sum = 0;
            for(int j = 0; j < prices[i].length; j++) {
                sum += prices[i][j];
            }
            avgMap.put(stocks[i], sum / prices[i].length);
        }

        List<Map.Entry<String, Float>> sortedAvgs = new ArrayList<>(avgMap.entrySet());
        sortedAvgs.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));

        String[] output = new String[3];

        for(int i = 0; i < 3; i++) {
            output[i] = sortedAvgs.get(i).getKey();
        }

        return output;

    }

    public static void main(String[] args) {

        String[] stocks1 = {"AMZN", "CACC", "EQIX", "GOOG", "ORLY", "ULTA"};

        float[][] prices1 = {
                {3200.50f, 3210.75f, 3195.25f, 3225.60f, 3189.30f}, // AMZN
                {450.25f, 455.40f, 448.75f, 460.10f, 452.80f},     // CACC
                {750.30f, 760.90f, 755.10f, 770.50f, 765.75f},     // EQIX
                {2800.60f, 2820.80f, 2815.30f, 2835.75f, 2840.90f}, // GOOG
                {670.20f, 680.45f, 675.30f, 685.60f, 690.25f},     // ORLY
                {340.75f, 345.30f, 338.60f, 350.10f, 355.25f}      // ULTA
        };

        String[] topStocks = getTopStocks(stocks1, prices1);

        System.out.println("Top Stocks:");
        for (String stock : topStocks) {
            System.out.print(stock + " ");
        }
    }
}
