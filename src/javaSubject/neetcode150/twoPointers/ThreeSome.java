package javaSubject.neetcode150.twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ThreeSome {

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate elements for i
            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;

            while(j < k) {

                int sum = nums[i] + nums[j] + nums[k];

                if(sum == 0){
                    // Found a triplet with zero sum
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    // Skip duplicate elements for j
                    while(j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }

                    // Skip duplicate elements for k
                    while(j < k && nums[k] == nums[k - 1]) {
                        k--;
                    }

                    // Move the pointers
                    j++;
                    k--;
                } else if(sum < 0) {
                    // Sum is less than zero, increment j to increase the sum
                    j++;
                } else {
                    // Sum is greater than zero, decrement k to decrease the sum
                    k--;
                }
            }
        }

        return ans;
    }

    //Solution using streams
    public List<List<Integer>> threeSum2(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);



        IntStream.range(0, nums.length - 2)
                .filter(i -> i == 0 || (i > 0 && nums[i] != nums[i - 1]))
                .forEach(i -> {
                    int j = i + 1;
                    int k = nums.length - 1;

                    while (j < k) {
                        int sum = nums[i] + nums[j] + nums[k];

                        if (sum == 0) {
                            ans.add(Arrays.asList(nums[i], nums[j], nums[k]));

                            while (j < k && nums[j] == nums[j + 1]) {
                                j++;
                            }

                            while (j < k && nums[k] == nums[k - 1]) {
                                k--;
                            }

                            j++;
                            k--;
                        } else if (sum < 0) {
                            j++;
                        } else {
                            k--;
                        }
                    }
                });

        // Print or use the 'ans' list as needed
        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {-1,0,1,2,-1,-4};

        System.out.println(threeSum(nums));
    }
}
