package Neetcode150.arraysAndHashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;


public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> numMap = new HashMap<> ();

        for (int i = 0 ; i < nums.length ; i++) {

            if(numMap.containsKey ( nums[i] ))
                return new int[]{numMap.get ( nums[i] ), i};
            else
                numMap.put (target-nums[i], i);

        }
        // Return null if no valid result is found
        return null;
    }

    //Solution using streams
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int[] result = new int[2];
        int[] inc = {0}; // Using an array to simulate the increment

        IntStream.range(0, nums.length)
                .forEach(i -> {
                    int complement = target - nums[i];
                    if (numMap.containsKey(complement)) {
                        result[0] = numMap.get(complement);
                        result[1] = inc[0]++;
                    } else {
                        numMap.put(nums[i], inc[0]++);
                    }
                });

        return result[0] == 0 && result[1] == 0 ? null : result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);

        System.out.println ( Arrays.toString (result));
    }
}
