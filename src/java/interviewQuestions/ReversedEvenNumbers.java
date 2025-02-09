package java.interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReversedEvenNumbers {

    public static List<Integer> spell(List<Integer> numbers) {

        List<Integer> returnList = new ArrayList<> ();

        for(int i=numbers.size ()-1 ; i>=0; i--) {
            if(numbers.get ( i ) % 2 == 0) {
                returnList.add ( numbers.get ( i ) );
            }
        }

        return returnList;
    }

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>( Arrays.asList(1, 2, 3, 4, 5));

        System.out.println (spell ( numbers ));
    }
}
