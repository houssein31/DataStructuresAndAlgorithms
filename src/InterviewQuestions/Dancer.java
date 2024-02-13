package InterviewQuestions;

public class Dancer {

    public static void main(String[] args) {
        int en = 100000;
        System.out.println(getPositionAt(en));
    }

    public static int getPositionAt(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return -1;
        }

        int prevPrevStep = 1;
        int prevStep = -1;

        for (int i = 3; i <= n; i++) {
            int currentStep = prevStep - prevPrevStep;
            prevPrevStep = prevStep;
            prevStep = currentStep;
        }

        return prevStep;
    }
}
