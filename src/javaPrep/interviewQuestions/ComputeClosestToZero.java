package javaPrep.interviewQuestions;

//In this exercise, you have to analyze records of temperature to find the closest to zero.
//Implement the method int computeClosestIoZero(int[| ts) which takes an array of temperatures ts and returns the temperature closest to 0.

public class ComputeClosestToZero {

    public static int computeClosestToZero(int[] ts) {

        int absLowest = Integer.MAX_VALUE;
        int lowest = 0;

        for(int n : ts ) {
            if(Math.abs(n) < absLowest) {
                absLowest = Math.abs(n);
                lowest = n;
            }
        }

        return lowest;
    }

    public static void main(String[] args) {
        int[] temp = {7, -10, 13, 8, 4, -7, -12, -3, 3, -9, 6, -1, -5, 7};
        // Should return -1

        System.out.println(computeClosestToZero(temp));
    }
}
