package javaPrep.interviewQuestions;

// EqualToOneOrSumIsOne.a(int 1, int j) should return true if one of the arguments equals 1 or if their sum is equal to 1.
//
//For example:
//        EqualToOneOrSumIsOne.a(1, 5) returns true
//        EqualToOneOrSumIsOne. a(2, 3) returns false
//        EqualToOneOrSumIsOne.a(-3, 4) returns true

public class EqualToOneOrSumIsOne {

    public static boolean a(int i, int j) {

        if(i == 1 || j == 1 || i + j == 1) {
            return true;
        } else {
            return false;
        }
    }
}
