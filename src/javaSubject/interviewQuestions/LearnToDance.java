package javaSubject.interviewQuestions;

/*

The first thing you need to know is that you can only move forward, or backward. When moving backward, your number of steps will be negative.

This dance asks every performer to follow a precise sequence of steps:

-Stage 0: First, get away from obstacles by setting up your starting point at position 0
-Stage 1 : Take one step forward (+1 step)
-Stage 2 : Take two steps backward (-2 steps)
-To follow, the steps as well as the direction you will have to take in your next move will each time de obtained thanks to a specific calculation: the number of steps you took on the previous stage minus the number of steps you took on the penultimate stage (the second-last stage).

That is, on stage 3, a dancer will have to take 3 steps backwards (-2 - 1).

The image below shows the first steps of the dancer:

                      [$]
(1) ---|---|---|---|---|---|---
      -4  -3  -2  -1   0   1


                      [ ]>[$]
(2) ---|---|---|---|---|---|---
      -4  -3  -2  -1   0   1


                  [$] <-- [ ]
(3) ---|---|---|---|---|---|---
      -4  -3  -2  -1   0   1


      [$] <-----  [ ]
(4) ---|---|---|---|---|---|---
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
}
