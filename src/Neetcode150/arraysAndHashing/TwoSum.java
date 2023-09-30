package Neetcode150.arraysAndHashing;

import java.util.Arrays;
import java.util.HashMap;


public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> numMap = new HashMap<> ();

        for (int i = 0 ; i < nums.length ; i++) {

            if(numMap.containsKey ( nums[i] )) {
                int[] arrAnswer = {numMap.get ( nums[i] ), i};
                return arrAnswer;
            }
            else{
                numMap.put (target-nums[i], i);
            }
        }

        // Return null if no valid result is found
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);

        System.out.println ( Arrays.toString (result));
    }
}
