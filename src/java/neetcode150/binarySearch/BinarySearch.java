package java.neetcode150.binarySearch;

import java.util.Arrays;

public class BinarySearch {

    // USING BINARY SEARCh
    public static int search(int[] nums, int target) {
        int leftPointer = 0;
        int rightPointer = nums.length-1;

        while(leftPointer <= rightPointer) {
            int midPointer = (leftPointer + rightPointer)/2;
            if(nums[midPointer] == target) {
                return midPointer;
            }else if(nums[midPointer] < target) {
                leftPointer = midPointer+1;
            }else {
                rightPointer = midPointer-1;
            }
        }

        return -1;
    }


    // USING ARRAYS METHOD
    public static int search2(int[] nums, int target) {
        int index = Arrays.binarySearch(nums, target);
        return index >= 0 ? index : -1; // returns -1 if target is not found
    }

    // USING STREAM
    public static int search3(int[] nums, int target) {
        return Arrays.stream(nums)
                .boxed()
                .filter(n -> n == target)
                .findFirst()
                .map(n -> Arrays.binarySearch(nums, n)) // Using binarySearch to get the index
                .orElse(-1); // Return -1 if target not found
    }


    public static void main(String[] args) {
        int[] nums1 = {-1, 0, 3, 5, 9, 12};
        int target1 = 9;

        System.out.println(search(nums1, target1));
    }
}
