package Neetcode150.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutDuplicates {

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> charMap = new HashMap<>();
        int maxCount = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            // If the character has been seen and is within the current window, update the start pointer
            if (charMap.containsKey(currentChar) && charMap.get(currentChar) >= start) {
                start = charMap.get(currentChar) + 1;
            }

            // Update the character's latest index in the map
            charMap.put(currentChar, end);

            // Calculate the maximum length of substring found so far
            maxCount = Math.max(maxCount, end - start + 1);
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
