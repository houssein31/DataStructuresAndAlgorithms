package javaPrep.neetcode150.twoPointers;

public class SortedTwoSum {


    // Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

    public static int[] twoSum(int[] numbers, int target) {

        int start = 0;
        int end = numbers.length-1;

        while(start < end) {

            int sum = numbers[start] + numbers[end];

            if(sum == target) {
                return new int[]{start+1, end+1};
            } else if(sum < target) {
                start += 1;
            } else {
                end -= 1;
            }
        }

        return new int[]{start+1, end+1};

    }

    // Faster Solution
    public int[] twoSum2(int[] numbers, int target) {

        int l = 0, r = numbers.length - 1;

        while (numbers[l] + numbers[r] != target) {
            if (numbers[l] + numbers[r] < target) l++;
            else r--;
        }

        return new int[] {l+1, r+1};
    }

    public static void main(String[] args) {

        int[] nums = {2,7,11,15};
        int target = 9;

        int[] result = twoSum(nums, target);

        // Print the individual elements of the result array
        System.out.println("Index 1: " + result[0]);
        System.out.println("Index 2: " + result[1]);
    }
}
