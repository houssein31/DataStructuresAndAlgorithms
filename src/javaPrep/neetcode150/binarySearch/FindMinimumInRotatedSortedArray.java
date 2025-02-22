package javaPrep.neetcode150.binarySearch;

import java.util.Arrays;

public class FindMinimumInRotatedSortedArray {

    // USING BINARY SEARCH
    public static int findMin(int[] nums) {

        int left = 0;
        int right = nums.length -1;

        while(left < right) {

            int mid = (left + right) / 2;

            if(nums[mid] < nums[right])
                right = mid;
            else
                left = mid + 1;
        }

        return nums[right];
    }

    // USING STREAMS
    public static int findMin2(int[] nums) {
        return Arrays.stream(nums).min().orElseThrow(() -> new IllegalArgumentException("Array is empty"));
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{3,4,5,1,2};
        int[] nums2 = new int[]{4,5,6,7,0,1,2};
        int[] nums3 = new int[]{11,13,15,17};

        System.out.println(findMin(nums1)); // returns 1
        System.out.println(findMin(nums2)); // returns 0
        System.out.println(findMin(nums3)); // returns 11
    }
}
