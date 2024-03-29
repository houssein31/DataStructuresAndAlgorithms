package Neetcode150.arraysAndHashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<> ();

        for(int num : nums) {
            if(numSet.contains ( num ))
                return true;
            else
                numSet.add ( num );
        }

        return false;
    }

    //Solution using streams
    public boolean containsDuplicate2(int[] nums) {
        Set<Integer> numSet =  new HashSet<>();
        return Arrays.stream(nums).anyMatch(i -> !numSet.add(i));
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};

        System.out.println (containsDuplicate(nums));
    }
}
