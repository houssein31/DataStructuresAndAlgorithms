package javaPrep.interviewQuestions;

//You are asked to add some drama to a string.
//
//Given your string, you must:
//
//        • Add one exclamation mark to every group of consecutive exclamation marks (a single exclamation mark is also considered a group).
//        • Then, change all the periods "." to exclamation marks.
//
//See the example
//
// Paramater :     Roses are red. Oranges are orange! Yeah!!!
// Return Value :  Roses are red! Oranges are orange!! Yeah!!!!

public class AddExclamation {

    public static String addDrama(String text) {

        char[] chars = text.toCharArray();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < text.length(); i++) {
            if(chars[i] == '.') {
                sb.append('!');
            } else if(chars[i] == '!' && ( i == text.length() - 1 || chars[i+1] != '!')) {
                sb.append(chars[i]);
                sb.append('!');
            } else {
                sb.append(chars[i]);
            }
        }

        return new String(sb);
    }

    public static void main(String[] args) {
        String s1 = "Roses are red. Oranges are orange! Yeah!!!";

        System.out.println(addDrama(s1));
    }
}
