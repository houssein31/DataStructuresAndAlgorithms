package javaPrep.neetcode150.priorityQueue;

import java.util.PriorityQueue;

public class KthLargestElementinAStream {

    private int k;
    private PriorityQueue<Integer> minH;

    public KthLargestElementinAStream(int k, int[] nums) {
        this.k = k;
        this.minH = new PriorityQueue<>(k);

        for(int num: nums){
            add(num);
        }
    }

    public int add(int val) {
        if(minH.size() < k) {
            minH.offer(val);
        } else if(val > minH.peek()) {
            minH.poll();
            minH.offer(val);
        }

        return minH.peek();
    }

    public static void main(String[] args) {
        int k = 3;
        int[] nums = {4, 5, 8, 2};
        KthLargestElementinAStream kthLargest = new KthLargestElementinAStream(k, nums);

        System.out.println(kthLargest.add(3));  // Output: 4
        System.out.println(kthLargest.add(5));  // Output: 5
        System.out.println(kthLargest.add(10)); // Output: 5
        System.out.println(kthLargest.add(9));  // Output: 8
        System.out.println(kthLargest.add(4));  // Output: 8
    }
}
