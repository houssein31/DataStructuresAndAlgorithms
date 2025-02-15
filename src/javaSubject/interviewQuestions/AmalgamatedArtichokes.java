package javaSubject.interviewQuestions;

/*
* You are an analyst at Maria Artichokes (MA). As with any company, MA has had some very good times as well as some bad
* ones. You are responsible for conducting trending analysis of the stock prices for MA, and you want to determine the
* largest decline in stock prices over various time spans.

* For example, if over a span of time the stock prices were 19, 12, 13, 11, 20 and 14, then the largest decline would be
*  8 between the first and fourth price. If the last price had been 10 instead of 14, then the largest decline would have
* been 10 between the last two prices.

* You have done some previous analyses and have found that the stock price over any period of time can be modelled
* reasonably accurately with the following equation: price(k) = p • (sin(a • k + b) + cos (c • k + d) + 2) where p, a, b, c
* and d are constants. You would like you to write a program to determine the largest price decline over
*  a given sequence of prices.

* Figure 1 illustrates the price function for the provided sample input. You must consider the prices only for integer values of k.

* Hint: This question is straightforward. You're given a price function and given values p, a, b, c, and d that you need
* for the price function. If you plot the function and you take the integer points (k) and you want to find the pair of
* points that has the largest difference between the max to the left and the minimum to the right. Now, to do this and
* since this can be up to 1 million such points you need a linear or log linear solution. So, going from the left and keeping
* track of what is the max number you've got and comparing that max number with the current number, if that difference is the
* biggest difference seen so far, then we save it. Reaching to the end, you'll have the correct answer. I would like to highlight
*  that, if there's a strongly increasing sequence then you should return 0; initialize the answer to zero. This problem gives
* the fluctuation of stock prices over a period of time, and the candidate simply needs to find the start and end of the
* largest price drop. The candidate might use the "math" library functions "sin" and "cos" to find those prices.

* Input:
The input consists of a single line containing 6 integers p (1 ≤ p ≤ 1000), a, b, c, d (0 ≤ a, b, c, d ≤ 1000) and n (1 s n ≤ 10^6). The sequence of stock prices to consider is price (1), price (2), .., price (n).

* Output:
Display the maximum decline in the stock prices. If there is no decline, display the number 0. Your output should have an absolute or relative error of at most 10^-6.

Test Input:
42 1 23 4 8 10
*
Expected Output:
104.855110
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class AmalgamatedArtichokes {

    public static void stockAnalysis(String line1) {

        String[] stringArr = line1.split(" ");
        int[] numArr = new int[stringArr.length];

        for (int i = 0; i < stringArr.length; i++) {
            numArr[i] = Integer.parseInt(stringArr[i]);
        }

        double p = (double)numArr[0];
        double a = (double)numArr[1];
        double b = (double)numArr[2];
        double c = (double)numArr[3];
        double d = (double)numArr[4];
        int n = numArr[5];

        double maxDecline = 0;
        double maxPrice =  p * (Math.sin(a + b) + Math.cos(c + d) + 2);
        double minPrice = maxPrice;

        for(int k = 1; k <= n; k++) {
            double price =  p * (Math.sin(a * k + b) + Math.cos(c * k + d) + 2);
            maxDecline = Math.max(maxDecline, maxPrice - price);
            maxPrice = Math.max(maxPrice, price);
            minPrice = Math.min(minPrice, price);

        }

        maxDecline = Math.max(0, maxDecline);

        System.out.println(maxDecline);
    }

    public static void main(String[] args) throws IOException {

        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);

        String line;

        while((line = in.readLine()) != null) {
            stockAnalysis(line);
        }

    }
}
