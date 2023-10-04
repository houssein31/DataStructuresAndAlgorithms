package FDM;

public class ArmstrongNumber {

    public static boolean isArmstrongNumber(int number) {
        double armNumb = 0;

        char[] digits = String.valueOf(number).toCharArray ();

        for(char c : digits) {
            double currentPow = Math.pow ( (double)(c - '0'), (double)digits.length );
            armNumb = armNumb + currentPow;
        }

        if (armNumb == number)
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
