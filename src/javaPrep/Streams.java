package javaPrep;

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
//
//        // FIND LONGEST WORD
//        List<String> words = Arrays.asList("apple", "banana", "cherry", "blueberry");
//
//        String longest = words.stream()
//                .sorted((a, b) -> Integer.compare(b.length(), a.length()))
//                .findFirst()
//                .orElse(null);
//
//        OR
//
//        String longest = words.stream().max((w1, w2) -> Integer.compare(w1.length(), w2.length())).orElse(null);
//
//        System.out.println(longest);
// -------------------------------------------------------------------------
//        CONVERT TO UPPERCASE
///
//        String[] words = {"apple", "banana", "cherry"};
//
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
//
//
//        ---------------------------------------------------------------
//        |  PART 2
//        ---------------------------------------------------------------
//
//        Given a List<String> names, use streams to count how many names start with a, e, i, o, u (case-insensitive).
//
//        List<String> vStrings = Arrays.asList("apple", "Cake", "Orange", "banana");
//
//        int vCount = (int)vStrings.stream()
//                .map(s -> s.toLowerCase())
//                .filter(s -> s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o' || s.charAt(0) == 'u')
//                .count();
//
//        System.out.println(vCount);
//
//        ---------------------------------------------------------------
//
//        Convert a list of integers to a list of their squares, but remove duplicates
//
//        Input: List<Integer> nums
//        Output: List of squared values, unique, sorted ascending.
//
//        List<Integer> nums = Arrays.asList(2, 3, 4, 5, 6, 7, 7, 8, 8, 9);
//
//        List<Integer> newNums = nums.stream()
//                .distinct()
//                .map(n -> (int)Math.pow(n, 2))
//                .sorted()
//                .collect(Collectors.toList());
//
//        System.out.println(newNums);
//
//        ---------------------------------------------------------------
//
//
//        Group a list of people by age
//
//        class Person {
//            String name;
//            int age;
//
//            Person(String name, int age) {
//                this.name = name;
//                this.age = age;
//            }
//        }
//
//        Person p1 = new Person("George", 22);
//        Person p2 = new Person("Max", 22);
//        Person p3 = new Person("Julie", 21);
//        Person p4 = new Person("Lucie", 21);
//        Person p5 = new Person("Marc", 24);
//
//        List<Person> personList = Arrays.asList(p1, p2, p3, p4, p5);
//
//        Map<Integer, List<Person>> ageMap = personList.stream()
//                .collect(Collectors.groupingBy(
//                        person -> person.age));
//
//        System.out.println(ageMap);
//
//
//        ---------------------------------------------------------------
//
//        Given a list of transactions, compute the total amount only for “SUCCESS”
//
//        Return the sum of all amounts where status.equals("SUCCESS").
//
//        class Transaction {
//            String status;
//            double amount;
//
//            Transaction(String status, double amount) {
//                this.status = status;
//                this.amount = amount;
//            }
//
//        }
//
//        Transaction t1 = new Transaction("SUCCESS", 1.11);
//        Transaction t2 = new Transaction("FAIL", 3.41);
//        Transaction t3 = new Transaction("FAIL", 7.16);
//        Transaction t4 = new Transaction("SUCCESS", 2.22);
//        Transaction t5 = new Transaction("SUCCESS", 3.33);
//
//        List<Transaction> transactionList = Arrays.asList(t1, t2, t3, t4, t5);
//
//        double sum = transactionList.stream()
//                .filter(t -> t.status.equals("SUCCESS"))
//                .mapToDouble(t -> t.amount)
//                .sum();
//
//        System.out.println(sum);
//
//        ---------------------------------------------------------------
//
//        Find the longest string in a list
//
//        From a List<String> words, return the longest word using streams.
//
//        Edge case: return empty Optional if list is empty.
//
//        List<String> stringList = Arrays .asList("Hello", "Oak", "Loop", "School", "Elementary");
//
//        Optional<String> longest = stringList.stream()
//                .max(Comparator.comparing(s -> s.length()));
//
//        ---------------------------------------------------------------
//
//        Create a frequency map of characters in a string
//
//        Input: "banana"
//
//        Output:
//        {b=1, a=3, n=2}
//        Use Collectors.groupingBy + Collectors.counting.
//
//        String ch = "chocolate";
//
//        Map<Character, Integer> fMap = ch.chars()
//                .mapToObj(c -> (char)c)
//                .collect(Collectors.groupingBy(
//                        c -> c,
//                        Collectors.collectingAndThen(
//                                Collectors.counting(),
//                                Long::intValue
//                        )
//                ));
//
//        Map<Character, Long> fMap2 =
//                ch.chars()
//                        .mapToObj(c -> (char) c)
//                        .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
//
//
//        System.out.println(fMap);


    }

}