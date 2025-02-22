package javaPrep.interviewQuestions;

//You are given a list of strings, representing a 2-dimensional grid.
//
//The first character of the first string is the upper left tile, of coordinates (0, 0).
//
// The grid always has the same size:
//        • Width = 15 (each string contains 15 characters)
//        • Height = 10 (there are 10 strings in the list)
//
// The grid contains a unique path, made of stars (character ) and of lowercase
//letters.
//
// The path always starts at the coordinates (0, 0), and does not contain any forks or loops. It moves in the four
// directions (up, right, down, left), but not diagonally.
//
// You must follow the path and record the letters in the order as you encounter them (do not record the stars).
// At the end of the path, output the string made with the letters.
// The path may immediately start with a letter and may end with a letter too.
// The path has a minimum length of two characters and contains at least one letter.
//        Example
//
// With the following path:
//
// ***
//   *
//   *
//   *с**od**1**
//             *
//    e        *
//    *        n
//    **m*a*g***
//
// You must return the string "codingame"


import java.util.ArrayList;
import java.util.List;

public class FollowLetterPath {

    public static String followPath(List<String> gridMap) {
        int height = 10; // Fixed height
        int width = 15;  // Fixed width

        // Movement directions: down, right, up, left
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        // Find the starting position
        int startX = -1, startY = -1;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (gridMap.get(i).charAt(j) != '*') {
                    startX = i;
                    startY = j;
                    break;
                }
            }
            if (startX != -1) break;
        }

        // If no valid start found, return empty string
        if (startX == -1) return "";

        boolean[][] visited = new boolean[height][width];
        StringBuilder result = new StringBuilder();

        // Current position
        int x = startX, y = startY;
        visited[x][y] = true;

        // Walk through the path
        while (true) {
            char currentChar = gridMap.get(x).charAt(y);

            // If it's a letter, add it to the result
            if (Character.isLetter(currentChar)) {
                result.append(currentChar);
            }

            boolean foundNext = false;
            for (int i = 0; i < 4; i++) {  // Try all 4 directions
                int newX = x + dx[i];
                int newY = y + dy[i];

                if (newX >= 0 && newX < height && newY >= 0 && newY < width) {
                    if (!visited[newX][newY] && gridMap.get(newX).charAt(newY) != '*') {
                        x = newX;
                        y = newY;
                        visited[x][y] = true;
                        foundNext = true;
                        break;  // Move to the next valid step
                    }
                }
            }

            if (!foundNext) break; // If no valid move found, exit loop
        }

        return result.toString();
    }

    public static void main(String[] args) {

        List<String> grid = new ArrayList<>();
        grid.add("***            ");
        grid.add("  *            ");
        grid.add("  *            ");
        grid.add("  *с**od**1**  ");
        grid.add("            *  ");
        grid.add("   e        *  ");
        grid.add("   *        n  ");
        grid.add("   **m*a*g***  ");
        grid.add("               ");
        grid.add("               ");

        System.out.println(followPath(grid));

    }
}
