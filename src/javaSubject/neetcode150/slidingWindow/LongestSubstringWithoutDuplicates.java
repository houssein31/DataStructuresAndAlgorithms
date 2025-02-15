package javaSubject.neetcode150.slidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutDuplicates {

    public static int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>();

        int maxLength = 0;
        int left = 0; // left pointer for the sliding window

        for (int right = 0; right < s.length(); right++) {
            // If the character at 'right' is already in the set,
            // remove characters from the left until it's removed.
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            // Add the current character and update the maximum length.
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        String s1 = "zxyzxyz";  // returns 3
        String s2 = "abcabcbb"; // returns 3

        System.out.println(lengthOfLongestSubstring(s1));
        System.out.println(lengthOfLongestSubstring(s2));
    }
}
