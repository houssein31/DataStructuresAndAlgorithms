package Neetcode150.slidingWindow;

import java.util.HashSet;

public class LongestSubstringWithoutDuplicates {

    public static int lengthOfLongestSubstring(String s) {

        int start = 0;

        HashSet<Character> charSet = new HashSet<>();
        charSet.add(s.charAt(start));

        int count = 1;
        int maxCount = 0;

        for(int end = 1; end < s.length(); end++) {

            if(charSet.contains(s.charAt(end))) {
                start = end;

                if(count > maxCount)
                    maxCount = count;

                count = 1;

                charSet.clear();
                charSet.add(s.charAt(start));
            } else {
                charSet.add(s.charAt(end));
                count++;
            }
        }

        return maxCount;

    }

    public static void main(String[] args) {

        String s1 = "zxyzxyz";  // returns 3
        String s2 = "abcabcbb"; // returns 3

        System.out.println(lengthOfLongestSubstring(s1));
        System.out.println(lengthOfLongestSubstring(s2));
    }
}
