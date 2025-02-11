package java.neetcode150.arraysAndHashing;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int pre[] = new int[n];
        int suff[] = new int[n];
        pre[0] = 1;
        suff[n - 1] = 1;

        for(int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] * nums[i - 1];
        }
        for(int i = n - 2; i >= 0; i--) {
            suff[i] = suff[i + 1] * nums[i + 1];
        }

        int ans[] = new int[n];
        for(int i = 0; i < n; i++) {
            ans[i] = pre[i] * suff[i];
        }
        return ans;
    }

    public static int[] productExceptSelf2(int[] nums) {

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
