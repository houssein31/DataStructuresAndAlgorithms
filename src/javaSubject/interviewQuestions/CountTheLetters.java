package javaSubject.interviewQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

//     Count the letters
//
//        Find the word with the highest rating in an array of strings, where the rating is based on the number of unique letters in the word and ties are broken by alphabetical (lexicographic order. The array contains words written by N family members. Each word is rated on a scale of 0 to 26.
//
//        Function description
//
//        Complete the solve function. This function takes the following 2 arguments and returns the word with the highest rating. If there is more than one word with the same rating then return the one that comes first lexicographically:
//        • N. Represents the total number of family members
//        • words. Represents the array of strings that contains the words written by family members
//
//        Input format for custom testing
//
//        Note: Use this input format if you are testing against custom input or writing code in a language where we don't provide bollerplate code
//        • The first line contains an integer N denoting the total number of family members.
//        • Next, the N line contains the words.
//
//        Output format
//
//        Return the word with the most distinct letters. If there is more than one word with the same distinct word count then return the one that comes first lexicographically.
//
//        Constraints
//        1 ≤ N ≤ 100
//        Maximum number of letters in words il = 100
//        words l contains lowercase English alphabets
//
//        Source: Wiley Edge's HackerEarth1

public class CountTheLetters {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        PrintWriter wr = new PrintWriter (System.out);

        int N = Integer.parseInt(br.readLine().trim());
        String[] words = new String[N];

        for (int i = 0; i < N; i++){
            words[i] = br.readLine ();
        }

        String out_ = solve(N, words);
        System.out.println(out_);
    }

    public static String solve(int N, String[] words) {

        String result= "";
        int maxChar = 0;

        for(String word : words) {

            ArrayList<Character> tempArr = new ArrayList<> ();

            for(int i = 0; i<word.length(); i++) {

                if(tempArr.contains (word.charAt ( i ))){
                    tempArr.remove ( (Character)word.charAt ( i ) );
                } else {
                    tempArr.add ( word.charAt ( i ) );
                }
            }

            if(tempArr.size () > maxChar) {
                maxChar = tempArr.size ();
                result = word;
            }


        }

        return result;
    }
}
