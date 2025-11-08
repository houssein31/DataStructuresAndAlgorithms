package javaPrep.interviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringUniqueChar {

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int maxLen = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);

            if (map.containsKey(c)) {
                // Move start pointer to the right of the last seen index of c
                start = Math.max(start, map.get(c) + 1);
            }

            map.put(c, end); // Update the last seen index
            maxLen = Math.max(maxLen, end - start + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(LongestSubstringUniqueChar.lengthOfLongestSubstring(s));
    }

}
