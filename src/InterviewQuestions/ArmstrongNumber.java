package InterviewQuestions;


/*
Armstrong Numbers

Programming challenge description:
An Armstrong number is an n-digit number that is equal to the sum of the n" powers of its digits. Determine if the input numbers are Armstrong numbers.

Input:
Your program should read lines from standard input. Each line has a positive integer.

Output:
Print out True if the number is an Armstrong number, or False if not.

*/
public class ArmstrongNumber {

    public static boolean isArmstrongNumber(int number) {
        double armNumber=0;

        char[] digits = String.valueOf(number).toCharArray();

        for(char c : digits){

            double currentPower = Math.pow((double)(c - '0'), (double)digits.length);
            armNumber += currentPower;
//            System.out.println(armNumber);
        }

        if(armNumber == number)
            return true;
        else
            return false;
    }


    public static void main(String[] args) {
        int number1 = 351;
        int number2 = 153;

        System.out.println (isArmstrongNumber ( number2 ));
    }
}
