package javaPrep.interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//In the enchanted land of Evenaria, an elf named Codelia was searching for the mystical Even Stones, which maintained
//balance and harmony. One day, she discovered an ancient scroll with a list of numbers representing their locations.
//
//However, the scroll was damaged and the numbers looked scrambled.
//Codelia sought the wise counsel of an old owl, who advised her to reverse the list and keep only even numbers to unveil
//the original sequence of the stones. Now, it's up to you to help Codelia decipher the ancient scroll by writing a spell
//that performs this operation.


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
