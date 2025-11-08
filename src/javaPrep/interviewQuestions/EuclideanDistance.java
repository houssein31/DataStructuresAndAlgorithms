package javaPrep.interviewQuestions;
/*

An ant on the floor can move in the 4 diagonal directions, which are defined from the point of view of a fixed aerial
observer (the ant does not "turn").

You are given the parameter moves: a list of integers, containing the ant steps.
Calculate the euclidean distance between the starting position and the final position of the ant.

Each step is a value between 0 and 3:
        • 0: the ant moves one unit to the up and one unit to the right.
        • 1: the ant moves one unit to the down and one unit to the right.
        • 2: the ant moves one unit to the down and one unit to the left.
        • 3: the ant moves one unit to the up and one unit to the left.

+ー-ー＋ー-ー+ー-ー＋
|  3  |    |  0  |
+ー-ー＋ー-ー+ー-ー＋
|     | A  |     |
+ーー-＋ー-ー+ー-ー＋
|  2  |    |  1  |
+ー-ー＋ー-ー+ー-ー＋

You must truncate the calculated euclidean distance and return an integer.

Detailed example

With this parameter:

moves = [ 0, 3, 0, 0, 2, 0, 0 ]

Horizontally, the ant moved 5 times to the right (the five Os) and 2 times to the left (the 2 and the 3). So, it is 3
units to the right from its origin point.

Vertically, the ant moved 6 times to the up (the five Os and the 3) and one time down (the 2). So, it is 5 units to the
up from its origin point.

The euclidean distance is sqrt(3^2 + 5^3) = 5.83

After truncating, the value to return is 5.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EuclideanDistance {

    public static int computeDistance(List<Integer> moves) {

        int up = 0;
        int down = 0;
        int left = 0;
        int right = 0;

        for ( int move : moves) {

            switch (move) {
                case 0: {
                    up++;
                    right++;
                }
                break;
                case 1: {
                    down++;
                    right++;
                }
                break;
                case 2: {
                    left++;
                    down++;
                }
                break;
                case 3: {
                    left++;
                    up++;
                }
            }
        }

        int ver = up - down;
        int hor = right - left;

        return (int)Math.sqrt(Math.pow(ver, 2) +  Math.pow(hor, 2) );

    }

    public static void main(String[] args) {

        List<Integer> moves = new ArrayList<>(Arrays.asList(0, 3, 0, 0, 2, 0, 0));
        System.out.println(computeDistance(moves));
    }
}
