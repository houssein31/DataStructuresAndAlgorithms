package Neetcode150.arraysAndHashing;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] answer = new int[n];

        // Initialize answer array with left products
        answer[0] = 1;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        // Calculate right products and multiply with answer array
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * right;
            right *= nums[i];
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] nums = {1,2,3,4};
        int[] nums2 = {-1,1,0,-3,3};


        int[] result = ProductOfArrayExceptSelf.productExceptSelf(nums);
        int[] result2 = ProductOfArrayExceptSelf.productExceptSelf(nums2);

        System.out.println(Arrays.toString(result));  // returns [24,12,8,6]
        System.out.println(Arrays.toString(result2));  // returns [0,0,9,0,0]
    }
}
