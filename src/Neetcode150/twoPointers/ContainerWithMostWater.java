package Neetcode150.twoPointers;

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;

        int maxWater = 0;

        while(left < right) {

            int width = right - left;

            int h = Math.min(height[left], height[right]);

            int water = width * h;

            maxWater = Math.max(water, maxWater);

            if(height[left] < height[right])
                left++;
            else
                right--;
        }

        return maxWater;
    }

    public static void main(String[] args) {

        int[] height1 = new int[]{1,8,6,2,5,4,8,3,7};
        int[] height2 = new int[]{1,1};

        System.out.println(maxArea(height1));
        System.out.println(maxArea(height2));

    }
}
