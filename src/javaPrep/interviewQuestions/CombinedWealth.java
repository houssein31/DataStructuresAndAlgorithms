package javaPrep.interviewQuestions;

//A famous Italian restaurant allows guests to enter only if they are present in pairs and the sum of the wealth of the
// people of the pair is a power of 3. A group of people wants to eat at the restaurant. Mathematically, if there are two
// people of wealth a and b, it forms a valid pair if a + b = 3* for some positive integer k. They want to know how many
// possible pairs would be allowed entry. Given the individual wealth of the people, find the number of valid pairs.
//
//Notes
//• One person can be in multiple valid pairs
//• A pair of person X and Y is the same as a pair of person Y and X.
//
//Function description
//
//Complete the function solve provided in the editor. This function takes the following 2 parameters and returns the required answer:
// • N: Represents the number of people
// • wealth: Represents an array containing the wealth of the individual people
//
//Input format for custom testing
//
//Note: Use this input format if you are testing against custom input or writing code in a language where we don't provide boilerplate code.
// • The first line contains N, the number of people.
// • The second line contains an array wealth, denoting the wealth of the individual people.
//
// Output format
//
//Print a single integer indicating the number of valid pairs.
//
//Explanation
//
// Given
// • N= 4
// • position = 11, 5, 2, 47
//
// Output
// 2
//
// Approach
// The pair of first and third person has a sum of wealth of 3 which is a power of 3
// The pair of second and fourth person has a sum of wealth of 9 which is a power of 3.

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CombinedWealth {

    public static int solve(int N, long[] wealth) {

        // Store powers of 3 up to the max possible sum
        Set<Long> powersOfThree = new HashSet<>();
        long power = 1;
        while (power <= 2_000_000_000L) { // 2 * 10^9 to cover the max sum
            powersOfThree.add(power);
            power *= 3;
        }

        Map<Long, Integer> wealthCount = new HashMap<>();
        int validPairs = 0;

        // Iterate over the wealth array
        for (long x : wealth) {
            // Check if there's a previous wealth value y such that x + y = power_of_3
            for (long p : powersOfThree) {
                long complement = p - x;
                if (wealthCount.containsKey(complement)) {
                    validPairs += wealthCount.get(complement); // Add the count of such `y`
                }
            }
            // Add current wealth value to the HashMap for future lookups
            wealthCount.put(x, wealthCount.getOrDefault(x, 0) + 1);
        }

        return validPairs;
    }

    public static void main(String[] args) {

        int N1 = 4;
        long[] wealth1 = {1, 5, 2, 4};

        int N2 = 10;
        long[] wealth2 = {1, 3, 4, 3, 9, 6, 9, 6, 7, 5};

        System.out.println(solve(N1, wealth1));  // returns 2
        System.out.println(solve(N2, wealth2)); // returns 5
    }
}
