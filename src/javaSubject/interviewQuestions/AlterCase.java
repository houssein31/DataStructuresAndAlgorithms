package javaSubject.interviewQuestions;

/*

AlterCase

Programming challenge description:
Write a program that, given an input sentence, alternates the case of every alphabetic character, starting with uppercase. spaces and non-alphabetical characters should be added to the final output as is, le. they should not be taken into account when alternating between upperowercase.
Input:
Your program should read lines from standard Input. Each line contains a sentence, Assume all characters are AsGIk

Output:
For each sentence from standard input, print te standard eutput the sentenee suen that the first eharacter is upperease, the next sharaeter is lowerease and 80 on.

Test 1

Test Input:
    We are the world

Expected Output:
    We ArE tHe WORlD

 */
public class AlterCase {

    public static String alterStringCase(String phrase) {

        char[] phraseArray = phrase.toCharArray ();
        StringBuilder newPhrase = new StringBuilder ();

        boolean isCapital = true;
        char currentChar;

        for ( int i = 0; i< phraseArray.length; i++ ) {


            currentChar = phraseArray[i];
            if( Character.isLetter( currentChar ) && ( isCapital  ) )  {
                newPhrase.append ( Character.toUpperCase ( currentChar ));
                isCapital = !isCapital;
            } else if( Character.isLetter ( currentChar )  && ( !isCapital  ) ) {
                newPhrase.append ( Character.toLowerCase ( currentChar ));
                isCapital = !isCapital;
            } else if ( !Character.isLetter ( currentChar ))
                newPhrase.append ( currentChar );
        }

        return newPhrase.toString ();
    }

    public static String alterStringCaseProperSolution(String phrase) {
        char[] chars = phrase.toCharArray ();
        boolean uppercaseNext = true; //init to true to start with Capital

        for (int i = 0; i < chars.length; i++) {
            if(Character.isLetter ( chars[i] )){
                if(uppercaseNext) {
                    chars[i] =   Character.toUpperCase ( chars[i] );
                }else {
                    chars[i] = Character.toLowerCase ( chars[i] ) ;
                }
                uppercaseNext = !uppercaseNext;
            }
        }

        return new String (chars);
    }

    public static void main(String[] args) {

        String phrase1 = "We aRe the world";

        System.out.println (alterStringCase(phrase1));
        System.out.println (alterStringCaseProperSolution (phrase1));
    }
}
