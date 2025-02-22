package javaPrep.interviewQuestions;


//We call a integer a "duodigit" if its decimal representation uses no more than two different digits, For example,
// 12, 110, -33939 are duodigits, but 1921 is not Implement the method isDuoDigIt(number) which returns a string
//
// "y" if number is a duodigit
// "n" otherwise

import java.util.HashSet;
import java.util.Set;

public class DuoDigit {

    public static String isDuoDigit(int number) {

        Set<Character> cSet = new HashSet<Character>();

        char[] arrNumber = String.valueOf(number).toCharArray();

        for(char c : arrNumber) {

            if( c == '-')
                continue;

            cSet.add(c);
        }

        if(cSet.size() <= 2)
            return "y";
        else
            return "n";

    }

    public static void main(String[] args) {
        int n1 = 1;
        int n2 = -2020;
        int n3 = -2021;

        System.out.println(isDuoDigit(n1));  // return y
        System.out.println(isDuoDigit(n2));  // return y
        System.out.println(isDuoDigit(n3));  // return n
    }
}
