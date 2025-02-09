package java.neetcode150.arraysAndHashing;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {

        HashSet<Integer> numSet = new HashSet<>();

        for(int num : nums) {
            numSet.add(num);
        }

        int maxSeqLen = 0;

        for(int i = 0; i<nums.length; i++) {

            int currentNum = nums[i];

            int currentSeqLen = 1;

            if(!numSet.contains(currentNum - 1)) {
                while(numSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentSeqLen += 1;
                }

                maxSeqLen = Math.max(maxSeqLen, currentSeqLen);
            }
        }

        return maxSeqLen;
    }

    public static void main(String[] args) {

        int[] nums = {100,4,200,1,3,2};
        int[] nums2 = {0,3,7,2,5,8,4,6,0,1};

        System.out.println(longestConsecutive(nums)); // return 4
        System.out.println(longestConsecutive(nums2));  // returns 9
    }

}
