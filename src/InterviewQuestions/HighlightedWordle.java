package InterviewQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class HighlightedWordle {

    public enum Color { GREEN, YELLOW, GREY }

    public static void main (String[] args) {
        System. out.println ("guess: MERIT -> answer: MODEL");
        List<Color> a = highlightedWordleGPT ("MERIT", "MODEL");
        System.out.println (a);
        System. out.println ("Should be: ");
        System.out.println ("[GREEN, YELLOW, GREY, GREY, GREY]");
        System. out.println("guess: TOOTH - answer: HOTEL");
        a = highlightedWordleGPT ("TOOTH", "HOTEL");
        System.out.println(a);
        System. out.println ("Should be: ");
        System. out.println ("[YELLOW, GREEN, GREY, GREY, YELLOW]");
    }

//    public static void main(String[] args) {
//        List<Color> a = highlightedWordle ("HOTEL", "TOOTH");
//    }

    public static List<Color> highlightedWordle(String guess, String answer) {
        List<Color> list = new ArrayList<> ();

        Map<Character, List<Integer>> map = new HashMap<>();

        for (int i = 0; i <= answer.length()-1; i++) {

            char c = answer.charAt ( i );
            if(!map.containsKey ( c )) {
                map.put ( c, new ArrayList<> () );
            }
            map.get ( c ).add ( i );
        }

        System.out.println (map);

        for (int i = 0; i <= guess.length() - 1; i++) {

            char c = guess.charAt ( i );
            if(map.containsKey ( c )){

                if(map.get ( c ).contains ( i )){

                    if (map.get(c).size () == 1) {
                        map.remove (c);
                    }else {

                        for (int x = 0; x <= map.get ( c ).size () - 1; i++) {
                            if (i == map.get ( c ).get ( x )) {
                                map.get ( c ).remove ( x );
                            }
                        }
                        list.add ( Color.GREEN );
                    }

                } else {
                    if (map.get(c).size () == 1) {
                        map.remove (c);
                    }else {
                        map.get ( c ).remove ( 0 );
                        list.add ( Color.YELLOW );
                    }
                }



            }else {
                list.add ( Color.GREY );
            }
        }



        return list;
    }



    public static List<Color> highlightedWordleGPT(String guess, String answer) {
        List<Color> result = new ArrayList<>();

        Map<Character, Integer> answerLetterCounts = new HashMap<>();

        // Populate the map with letter counts from the answer
        for (char letter : answer.toCharArray()) {
            answerLetterCounts.put(letter, answerLetterCounts.getOrDefault(letter, 0) + 1);
        }

        // First, check for GREEN (correct letter in the correct position)
        for (int i = 0; i < Math.min(guess.length(), answer.length()); i++) {
            if (guess.charAt(i) == answer.charAt(i)) {
                result.add(Color.GREEN);
                char letter = guess.charAt(i);
                if (answerLetterCounts.get(letter) > 0) {
                    answerLetterCounts.put(letter, answerLetterCounts.get(letter) - 1);
                }
            }
        }

        // Next, check for YELLOW (correct letter in the wrong position)
        for (int i = 0; i < guess.length(); i++) {
            char letter = guess.charAt(i);
            if (answerLetterCounts.getOrDefault(letter, 0) > 0) {
                result.add(Color.YELLOW);
                answerLetterCounts.put(letter, answerLetterCounts.get(letter) - 1);
            }
        }

        // Finally, add GREY for any remaining letters in the guess
        for (char letter : guess.toCharArray()) {
            if (result.size() < guess.length() && answerLetterCounts.getOrDefault(letter, 0) == 0) {
                result.add(Color.GREY);
            }
        }

        return result;
    }
}
