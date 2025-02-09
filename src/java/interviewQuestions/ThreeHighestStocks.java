package java.interviewQuestions;

import java.util.*;

public class ThreeHighestStocks {

    public static String[] getTopStocks(String[] stocks, float[][] prices) {

        List<Float> avg = new ArrayList<> ();

        for(int i = 0; i<=prices[0].length-1; i++) {
            avg.add ( (prices[0][i] + prices[1][i] + prices[2][i])/3 );
        }

        HashMap<String, Float> sorting = new HashMap<> ();

        for(int i = 0; i <= avg.size()-1; i++) {
            sorting.put ( stocks[i], avg.get (i) );
        }

        List<Map.Entry<String, Float>> list = new ArrayList<>(sorting.entrySet());

        list.sort( Collections.reverseOrder(Map.Entry.comparingByValue()));

        List<Map.Entry<String, Float>> firstThreeEntries = list.subList(0, 3);

        String[] firstThreeKeys = new String[firstThreeEntries.size()];

        for (int i = 0; i < firstThreeEntries.size(); i++) {
            firstThreeKeys[i] = firstThreeEntries.get(i).getKey();
        }

        return firstThreeKeys;

    }

    public static void main(String[] args) {

        String[] stocks1 = {"AMZN", "CACC", "EQIX", "GOOG", "ORLY", "ULTA"};
        float[][] prices1 = {{12.81f, 11.09f, 12.11f, 10.93f, 9.83f, 8.14f}, {10.81f, 9.09f, 10.11f, 13.93f, 12.83f, 12.14f}, {9.81f, 13.09f, 9.11f, 11.93f, 10.83f, 9.14f}};

        String[] topStocks = getTopStocks(stocks1, prices1);

        System.out.println("Top Stocks:");
        for (String stock : topStocks) {
            System.out.print(stock + " ");
        }
    }
}
