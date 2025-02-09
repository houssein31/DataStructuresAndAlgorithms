package java.interviewQuestions;

public class StepDance {

    //0  0  +1
    //1  1  -2
    //2  -1 -3  -> ( -2 - 1 = 3 )
    //3  -4 -1  -> ( -3 + 2 = -1 )
    //4  -5  2  -> ( -1 + 3 = 2 )
    //5  -3  3  -> ( 2 + 1 = 3 )
    //6  0   1  -> ( 3 - 2 = 1 0 )
    //7  1  -2  -> ( 1 - 3 = -2 )
    //8 -1  -3  -> (-2 - 1 = -3 )
    //9 -4  -1  -> (-3 + 2 = -1 )

    public static int stepDance(int n) {

        if( n == 0 )
            return 0;
        else if(n == 1)
            return 1;
        else if(n == 2)
            return -1;
        else {
            int[] position = new int[n +1];
            int[] steps = new int[n +1];

            position[0] = 0;
            position[1] = 1;
            position[2] = -1;

            steps[0] = 0;
            steps[1] = 1;
            steps[2] = -2;

            for(int i = 3; i<=n; i++) {
                steps[i] = steps[i - 1] - steps[i - 2];
                position[i] = position[i - 1] + steps[i];
            }

            return position[n];
        }
    }
    public static void main(String[] args) {

        int nb1 = 3;  // returns -4
        int nb2 = 100000;  // returns -5

        System.out.println(stepDance(nb1));
    }

}
