package Neetcode150.OneDimensionDynamic;

public class ClimbingStairs {

// 1 -> 1  -- 1
// 2 -> 1+1 / 2  -- 2
// 3 -> 1+1+1 / 1+2 / 2+1   -- 3
// 4 -> 1+1+1+1 / 1+2+1 / 2+1+1 / 1+1+2 / 2+2 -- 5
// 5 -> 1+1+1+1+1 / 1+1+1+2 / 1+1+2+1 / 1+2+1+1 / 2+1+1+1 / 1+2+2 / 2+1+2 / 2+2+1 -- 8
// 6 -> 1+1+1+1+1+1 / 1+1+1+1+2 / 1+1+1+2+1 / 1+1+2+1+1 / 1+2+1+1+1 / 2+1+1+1+1 /1+1+2+2 / 1+2+1+2 / 2+1+1+2 / 2+1+2+1 / 2+2+1+1 / 1+2+2+1 / 2+2+2 -- 13

    public static int climbStairs(int n) {

        if(n == 1 || n == 2) return n;

        int[] stairs = new int[n + 1];

        stairs[1] = 1;
        stairs[2] = 2;

        for(int i = 3; i<=n; i++) {
            stairs[i] = stairs[i - 1] + stairs[i - 2];
        }

        return stairs[n];
    }

    public static void main(String[] args) {
        int nb = 6;
        System.out.println(climbStairs(6));
    }

}
