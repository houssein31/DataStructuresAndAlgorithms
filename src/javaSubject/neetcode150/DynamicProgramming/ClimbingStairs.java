package javaSubject.neetcode150.DynamicProgramming;

public class ClimbingStairs {

// 1 -> 1  -- 1
// 2 -> 1+1 / 2  -- 2
// 3 -> 1+1+1 / 1+2 / 2+1   -- 3
// 4 -> 1+1+1+1 / 1+2+1 / 2+1+1 / 1+1+2 / 2+2 -- 5
// 5 -> 1+1+1+1+1 / 1+1+1+2 / 1+1+2+1 / 1+2+1+1 / 2+1+1+1 / 1+2+2 / 2+1+2 / 2+2+1 -- 8
// 6 -> 1+1+1+1+1+1 / 1+1+1+1+2 / 1+1+1+2+1 / 1+1+2+1+1 / 1+2+1+1+1 / 2+1+1+1+1 /1+1+2+2 / 1+2+1+2 / 2+1+1+2 / 2+1+2+1 / 2+2+1+1 / 1+2+2+1 / 2+2+2 -- 13

    public static int climbStairs(int n) {

        if(n <= 3) return n;

        int prev1 = 3;
        int prev2 = 2;

        int cur =  0;

        for(int i = 3; i < n; i++) {
            cur = prev1 + prev2;
            prev2 = prev1;
            prev1 = cur;
        }

        return cur;
    }

    public static void main(String[] args) {
        int nb = 6;
        System.out.println(climbStairs(6));
    }

}
