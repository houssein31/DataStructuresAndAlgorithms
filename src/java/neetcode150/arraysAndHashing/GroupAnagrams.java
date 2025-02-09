package java.neetcode150.arraysAndHashing;

import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> anagramMap = new HashMap<>();

        for(String str: strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);

            if(anagramMap.containsKey(sortedString)) {
                anagramMap.get(sortedString).add(str);
            }else {
                List<String> anagramList = new ArrayList<>();
                anagramList.add(str);
                anagramMap.put(sortedString, anagramList);
            }
        }

        return new ArrayList<>(anagramMap.values());
    }

    public List<List<String>> groupAnagrams2(String[] strs) {

        // List<List<String>> ans = new ArrayList<>();

        String[] sortedStr = new String[strs.length];

        for(int i = 0; i<strs.length; i++) {
            char[] sChar = strs[i].toCharArray();
            Arrays.sort(sChar);
            sortedStr[i] = new String(sChar);
        }

        Map<String, ArrayList<String>> listMap = new HashMap<>();

        for(int i = 0; i<sortedStr.length; i++) {
            if(listMap.containsKey(sortedStr[i])) {
                // Get the existing list and add the new string to it
                ArrayList<String> existingList = listMap.get(sortedStr[i]);
                existingList.add(strs[i]);
            } else {
                // If key is not present, create a new list and put it in the map
                ArrayList<String> newList = new ArrayList<>();
                newList.add(strs[i]);
                listMap.put(sortedStr[i], newList);
            }
        }

        return new ArrayList<>(listMap.values());
    }

    public static void main(String[] args) {
        String[] strs1 = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> groupedAnagrams = groupAnagrams(strs1);

        for(List<String> group: groupedAnagrams) {
            System.out.println(group);
        }
    }
}