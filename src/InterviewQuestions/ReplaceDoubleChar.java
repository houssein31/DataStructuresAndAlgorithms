package InterviewQuestions;

import java.util.HashMap;

/*

Write a function 'code' that takes a string and returns a new string, where all input string characters are replaced according to the following rules:
If the character appears only once in the input string, replace it with 'x;
If the character appears several times in the input string, replace it with y; the function should be case insensitive

 */

public class ReplaceDoubleChar {
    public static String replaceCharacters( String phrase ) {

        HashMap<Character, Integer> charMap = new HashMap<> ();

        for (char c : phrase.toCharArray ()) {

            if (charMap.containsKey ( c )) {
                charMap.put ( c , charMap.get ( c )+1 );
            } else {
                charMap.put ( c , 1 );
            }
        }

        StringBuilder newPhrase = new StringBuilder ();

        for (char c : phrase.toCharArray ()) {

            if (charMap.get ( c ) == 1) {
                newPhrase.append ( 'x' );
            } else if (charMap.get ( c ) >= 2) {
                newPhrase.append ( 'y' );
            }
        }

        return newPhrase.toString ();
    }

    public static void main(String[] args) {
        String phrase1 = "Houssein";

        System.out.println (replaceCharacters ( phrase1 ));
    }
}
