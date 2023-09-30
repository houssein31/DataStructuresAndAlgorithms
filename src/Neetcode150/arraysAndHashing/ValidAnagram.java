package Neetcode150.arraysAndHashing;

import java.util.HashMap;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {

        if(s.length () != t.length ())
            return false;

        HashMap<Character, Integer> smap = new HashMap<>();
        HashMap<Character, Integer> tmap = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i++) {
            if(smap.containsKey ( s.toLowerCase().charAt ( i ) )) {
                int valueCounter = smap.get(s.charAt ( i ));
                smap.put(s.charAt ( i ), valueCounter++);
            } else {
                smap.put ( s.charAt ( i ), 1 );
            }
        }

        for(int i = 0 ; i < t.length() ; i++) {
            if(tmap.containsKey ( t.charAt ( i ) )) {
                int valueCounter = tmap.get(t.charAt ( i ));
                tmap.put(t.charAt ( i ), valueCounter++);
            } else {
                tmap.put ( t.charAt ( i ), 1 );
            }
        }

        return smap.equals ( tmap );
    }

    public static boolean isAnagram2(String s, String t) {
    return false;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println (isAnagram ( s, t ));
    }
}

