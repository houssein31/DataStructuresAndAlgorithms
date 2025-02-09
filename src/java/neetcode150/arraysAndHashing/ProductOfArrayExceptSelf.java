package java.neetcode150.arraysAndHashing;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {

        int[] output = new int[nums.length];

        for(int i = 0; i<nums.length; i++) {
            output[i] = 1;
        }

        int left = 1;
        for(int i = 0; i<nums.length; i++) {
            output[i] *= left;
            left *= nums[i];
        }

        int right = 1;
        for(int i = nums.length -1; i>=0; i--) {
            output[i] *= right;
            right *= nums[i];
        }

        return output;
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
