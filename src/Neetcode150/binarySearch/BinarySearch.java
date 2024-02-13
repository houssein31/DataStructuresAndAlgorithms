package Neetcode150.binarySearch;

public class BinarySearch {

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

    public static void main(String[] args) {
        int[] nums1 = {-1, 0, 3, 5, 9, 12};
        int target1 = 9;

        System.out.println(search(nums1, target1));
    }
}
