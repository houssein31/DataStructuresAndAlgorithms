package javaPrep.interviewQuestions;


/*
Sam's house has an apple tree and an orange tree that yield an abundance of fruit.
In the diagram below, the red region denotes his house, where 's' is the start point, and 't' is the endpoint.
The apple tree is to the left of his house, and the orange tree is to its right.
You can assume the trees are located on a single point, where the apple tree is at point 'a', and the orange tree is at point 'b'.

   a       s       t       b
   |-------|=======|-------|
   Apple     House       Orange

When a fruit falls from its tree, it lands 'd' units of distance from its tree of origin along the x-axis.
A negative value of 'd' means the fruit fell 'd' units to the tree’s left,
and a positive value of 'd' means it falls 'd' units to the tree’s right.

Given the value of 'd' for 'm' apples and 'n' oranges,
determine how many apples and oranges will fall on Sam’s house (i.e., in the inclusive range [s, t]).

Example:
Sam’s house is between s = 7 and t = 10.
The apple tree is located at a = 4 and the orange at b = 12.
There are m = 3 apples and n = 3 oranges.

Apples are thrown: apples = [2, 3, -4] (units from tree a = 4),
Oranges are thrown: oranges = [3, -2, -4] (units from tree b = 12)

Adding each apple distance to the position of the tree:
  => [4 + 2, 4 + 3, 4 + (-4)] = [6, 7, 0]

Adding each orange distance to the position of the orange tree:
  => [12 + 3, 12 + (-2), 12 + (-4)] = [15, 10, 8]

One apple (7) and two oranges (10 and 8) land in the inclusive range [7, 10].
So we print:
1
2
*/

public class FruitsFallingOnHouse {

    public static void main(String[] args) {

        int[] result = fruitsOnHouse(7, 10, 4, 12, new int[]{2, 3, -4}, new int[]{3, -2, -4});
        System.out.println("Apples on house: " + result[0]);
        System.out.println("Oranges on house: " + result[1]);

    }

    public static int[] fruitsOnHouse(int sHouse, int tHouse, int appleTree, int orangeTree, int[] applesPos, int[] orangesPos) {

        int appleCount = 0;
        int orangeCount = 0;

        for(int apple : applesPos) {
            int currentPos = appleTree + apple;
            if(currentPos >= sHouse) {
                appleCount++;
            }
        }

        for(int orange : orangesPos) {
            int currentPos = orangeTree + orange;
            if(currentPos <= tHouse) {
                orangeCount++;
            }
        }

        return new int[]{appleCount, orangeCount};
    }
}



