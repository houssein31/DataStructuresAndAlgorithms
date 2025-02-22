package javaPrep.interviewQuestions;

/*

The first thing you need to know is that you can only move forward, or backward. When moving backward, your number of steps will be negative.

This dance asks every performer to follow a precise sequence of steps:

-Stage 0 : First, get away from obstacles by setting up your starting point at position 0
-Stage 1 : Take one step forward (+1 step)
-Stage 2 : Take two steps backward (-2 steps)
-To follow, the steps as well as the direction you will have to take in your next move will each time be obtained thanks
to a specific calculation: the number of steps you took on the previous stage minus the number of steps you took on the
penultimate stage (the second-last stage).

That is, on stage 3, a dancer will have to take 3 steps backwards (-2 - 1).

The image below shows the first steps of the dancer:

                      [$]
(0) ---|---|---|---|---|---|---
      -4  -3  -2  -1   0   1


                      [ ]>[$]
(1) ---|---|---|---|---|---|---
      -4  -3  -2  -1   0   1


                  [$] <-- [ ]
(2) ---|---|---|---|---|---|---
      -4  -3  -2  -1   0   1


      [$] <-----  [ ]
(3) ---|---|---|---|---|---|---
      -4  -3  -2  -1   0   1


Implement the method int Algorithm.getPositionAt(int n) to return the dancer's position at stage n

Input: 0 <= n <= 2147483647

Important note: Try to save memory (RAM) space and CPU cycles if possible.

Examples:
Algorithm.getPositionAt(3) returns -4
Algorithm.getPositionAt(100000 returns -5
Algorithm.getPositionAt(2147483647) retu rns 1
*/
public class LearnToDance {

    public static int getPosition(int n) {

        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return -1;

        int curr = -1;

        int prev = -2;
        int prevPrev = 1;

        for(int i = 3; i <= n; i++) {

            int newPrev = prev - prevPrev;

            curr += newPrev;

            prevPrev = prev;
            prev = newPrev;
        }

        return curr;
    }

    public static void main(String[] args) {
        int stage3 = 3;
        int stage6 = 6;

        System.out.println(getPosition(stage3));  // returns -4
        System.out.println(getPosition(stage6)); // returns 0
    }

}
