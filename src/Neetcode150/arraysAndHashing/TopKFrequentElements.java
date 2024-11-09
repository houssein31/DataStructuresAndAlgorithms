package Neetcode150.arraysAndHashing;

import java.util.*;
import java.util.stream.Collectors;

public class TopKFrequentElements {


    //USING BUCKETING
    public static int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> freqMap = new HashMap<>();

        for(int num : nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] buckets = new List[nums.length + 1];
        freqMap.forEach((num, freq) -> {
            if(buckets[freq] == null) buckets[freq] = new ArrayList<>();
            buckets[freq].add(num);
        });

        List<Integer> result = new ArrayList<>();
        for(int i = buckets.length - 1; i > 0 && result.size() < k; i--) {
            if(buckets[i] != null) result.addAll(buckets[i]);
        }

        return result.stream().mapToInt(i -> i).toArray();
    }



    // USING STREAMS
    public static int[] topKFrequent2(int[] nums, int k) {
        // Create a frequency map using Stream API
        Map<Integer, Integer> count = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toMap(n -> n, n -> 1, Integer::sum));

        // Collect the top K elements by frequency
        return count.entrySet().stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue())) // Sort by frequency descending
                .limit(k) // Limit to k elements
                .map(Map.Entry::getKey) // Map to keys only
                .mapToInt(Integer::intValue) // Convert to int array
                .toArray();
    }



    public static void main(String[] args) {

        int[] nums1 = new int[]{1,1,1,2,2,3};
        int k1 = 2;

        int[] nums2 = new int[]{1};
        int k2 = 1;

        System.out.println(topKFrequent(nums1, k1));
        System.out.println(topKFrequent(nums2, k2));
    }
}
