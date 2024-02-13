package Neetcode150.arraysAndHashing;

import java.util.Arrays;

public class ValidAnagram {

    //working with one combined string
    public static boolean isAnagram(String st) {

        String[] wordArr = st.toLowerCase().split(" ");

        String ogString1 = wordArr[0];
        String ogString2 = wordArr[1];

        char[] charArr1 = ogString1.toCharArray();
        char[] charArr2 = ogString2.toCharArray();

        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        if(Arrays.equals(charArr1, charArr2))
            return true;
        else
            return false;

    }
    //working with two strings
    public static boolean isAnagram2(String s, String t) {

        char[] sArr = s.toLowerCase().toCharArray();
        char[] tArr = t.toLowerCase().toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        if(Arrays.equals(sArr, tArr))
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        String combinedSting = "Anagram Nagaram";

        System.out.println (isAnagram ( combinedSting ));
    }
}

