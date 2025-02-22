package javaPrep;

import java.util.Arrays;
import java.util.List;

public class Streams {
    public static void main(String[] args) {


//        FIND EVEN NUMBER
//
//        int[] numArr = {1, 2, 3, 4, 5};
//
//        int[] answer = IntStream.of(numArr).filter(i -> i%2 == 0).toArray();
//
//        System.out.println(Arrays.toString(answer));
// -------------------------------------------------------------------------
//        FIND EVEN NUMBER COUNT
//
//        int[] numArr = {1, 2, 3, 4, 5};
//
//        int count = (int) IntStream.of(numArr).filter(n -> n%2 == 0).count();
//
//        System.out.println(count);
// -------------------------------------------------------------------------
//        Practice Area

        // FIND LONGEST WORD
        List<String> words = Arrays.asList("apple", "banana", "cherry", "blueberry");

        String longest = words.stream().max((w1, w2) -> Integer.compare(w1.length(), w2.length())).orElse(null);

        System.out.println(longest);

// -------------------------------------------------------------------------
//        CONVERT TO UPPERCASE
//
//        String[] words = {"apple", "banana", "cherry"};
//
//        String[] answer = Arrays.stream(words).map(word -> word.toUpperCase()).toArray(String[]::new);
//
//        System.out.println(Arrays.toString(answer));
// -------------------------------------------------------------------------
//        SUM OF SQUARES
//
//       int[] numbs = {1, 2, 3};
//
//       int[] answer = IntStream.of(numbs).map(n -> n * n).toArray();
//
//        System.out.println(Arrays.toString(answer));
// -------------------------------------------------------------------------
//        COUNT NEGATIVE NUMBERS
//
//        int[] numb = {1, -2, 3, -4, 5};
//
//        int answer = (int)IntStream.of(numb).filter(n -> n < 0).count();
//
//        System.out.println(answer);
// ------------------------------------------------------------------------
//       COLLECT LENGTH OF STRINGS
//
//        List<String> words = new ArrayList<>();
//
//        words.add("apple");
//        words.add("banana");
//        words.add("cherry");
//        words.add("orange");
//
//        List<Integer> answer = words.stream().map(word -> word.length()).collect(Collectors.toList());
//
//        System.out.println(answer);
// -------------------------------------------------------------------------
//        FIND MAXIMUM NUMBER
//
//        List<Integer> numbers = new ArrayList<>();
//
//        numbers.add(1);
//        numbers.add(5);
//        numbers.add(3);
//        numbers.add(7);
//        numbers.add(9);
//
//        int answer = numbers.stream().max((a, b) -> Integer.compare(a, b)).orElseThrow();
//
//        System.out.println(answer);
// -------------------------------------------------------------------------
//        CONVERT STRINGS TO INTs AND KEEP EVEN NUMBERS
//
//        List<String> nums = Arrays.asList("1", "2", "3");
//
//        List<Integer> answer = nums.stream().map(s -> Integer.parseInt(s)).filter(n -> n % 2 == 0).collect(Collectors.toList());
//
//        System.out.println(answer);
// -------------------------------------------------------------------------
//        Assume that in ("a,1", "b,2", "c,3"), a,b,c are names of users and and 1,2,3 are their IDs. I want a list that gives me the
//        users (without the ID) in decreasing order of IDs (1,2,3). (Expected answer should be (c, b, a)
//
//        List<String> nums = Arrays.asList("a,1", "b,2", "c,3");
//
//        List<String> result = nums.stream()
//                .sorted(Comparator.comparingInt(
//                        s -> Integer.parseInt(((String) s).replaceAll("[^0-9]", "0"))
//                ).reversed())
//                .map(s -> s.replaceAll("[^a-zA-Z]", ""))
//                .collect(Collectors.toList());
//
//        System.out.println(result);
//

// -------------------------------------------------------------------------
//        SUM OF CUBES
//
//        List<Integer> numbers = new ArrayList<>();
//
//        numbers.add(1);
//        numbers.add(5);
//        numbers.add(9);
//
//        int answer = numbers.stream().map(n -> n*n*n).mapToInt(Integer::intValue).sum();
//
//        System.out.println(answer);
// -------------------------------------------------------------------------
//        GROUP STRING BY LENGTH
//
//        String[] words = {"apple", "bat", "cat", "dog", "elephant"};
//
//        Map<Integer, Long> answer = Arrays.stream(words).collect(Collectors.groupingBy(word -> word.length(), Collectors.counting()));
//
//        System.out.println(answer);
//-------------------------------------------------------------------------
//        FIND THE MAXIMUM
//
//        // Create a list of people using an anonymous class
//        List<Map<String, Object>> people = Arrays.asList(
//                new HashMap<String, Object>() {{
//                    put("name", "Alice");
//                    put("age", 25);
//                }},
//                new HashMap<String, Object>() {{
//                    put("name", "Bob");
//                    put("age", 30);
//                }},
//                new HashMap<String, Object>() {{
//                    put("name", "Charlie");
//                    put("age", 35);
//                }},
//                new HashMap<String, Object>() {{
//                    put("name", "David");
//                    put("age", 28);
//                }}
//        );
//
//        Map<String, Object> oldestPerson = people.stream().max(Comparator.comparingInt(person -> (int) person.get("age"))).orElse(null);
//        System.out.println("Person(\"" + oldestPerson.get("name") + "\"): " + oldestPerson.get("age") + ")");
// -------------------------------------------------------------------------
//        FLATTEN A LIST OF LISTS INTO A SIGNLE LIST
//
//        // Create the outer list
//        List<List<Integer>> listOfLists = new ArrayList<>();
//
//        // Create the inner lists
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(1);
//        list1.add(2);
//
//        List<Integer> list2 = new ArrayList<>();
//        list2.add(3);
//        list2.add(4);
//
//        List<Integer> list3 = new ArrayList<>();
//        list3.add(5);
//
//        // Add the inner lists to the outer list
//        listOfLists.add(list1);
//        listOfLists.add(list2);
//        listOfLists.add(list3);
//
//        List<Integer> flattened = listOfLists.stream().flatMap(innerL -> innerL.stream()).collect(Collectors.toList());
//
//        System.out.println(flattened);
    }
}