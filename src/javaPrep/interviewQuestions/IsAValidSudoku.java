package javaPrep.interviewQuestions;

//You need to check whether a sudoku grid is correct.
//
//A sudoku consists of a 2-dimensional board, 9 cells by 9 cells. Each cell contains a digit from 1 to 9.
//
//All the sudoku cells you get in input are already filled.
//
//The sudoku is correct when all the following conditions are met:
// • Each row contains every digit from 1 to 9 only once.
// • Each column contains every digit from 1 to 9 only once.
// • Each region contains every digit from 1 to 9 only once. The sudoku is divided into 9 regions,
//   made up of squares of 3 cells by 3 cells.
//
//Return 1 if the sudoku is valid, otherwise return 0.

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IsAValidSudoku {

    public static int isValidSudoku(List<List<Integer>> sudoku) {

        Set<String> freq = new HashSet<>();

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {

                int curr = sudoku.get(i).get(j);

                if(!freq.contains(curr + " found in row " + i)) {
                    freq.add(curr + " found in row " + i);
                } else {
                    return 0;
                }

                if(!freq.contains(curr + " found in col " + j)) {
                    freq.add(curr + " found in col " + j);
                } else {
                    return 0;
                }

                if(!freq.contains(curr + " found in subbox " + i/3 + " and " + j/3)) {
                    freq.add(curr + " found in subbox " + i/3 + " and " + j/3);
                } else {
                    return 0;
                }

            }
        }

        return 1;
    }

    public static void main(String[] args) {

        List<List<Integer>> sudoku1 = List.of(
                List.of(5, 3, 4, 6, 7, 8, 9, 1, 2),
                List.of(6, 7, 2, 1, 9, 5, 3, 4, 8),
                List.of(1, 9, 8, 3, 4, 2, 5, 6, 7),
                List.of(8, 5, 9, 7, 6, 1, 4, 2, 3),
                List.of(4, 2, 6, 8, 5, 3, 7, 9, 1),
                List.of(7, 1, 3, 9, 2, 4, 8, 5, 6),
                List.of(9, 6, 1, 5, 3, 7, 2, 8, 4),
                List.of(2, 8, 7, 4, 1, 9, 6, 3, 5),
                List.of(3, 4, 5, 2, 8, 6, 1, 7, 9)
        );

        List<List<Integer>> sudoku2 = List.of(
                List.of(5, 3, 4, 6, 7, 8, 9, 1, 2),
                List.of(5, 7, 2, 1, 9, 5, 3, 4, 8),
                List.of(1, 9, 8, 3, 4, 2, 5, 6, 7),
                List.of(8, 5, 9, 7, 6, 1, 4, 2, 3),
                List.of(4, 2, 6, 8, 5, 3, 7, 9, 1),
                List.of(7, 1, 3, 9, 2, 4, 8, 5, 6),
                List.of(9, 6, 1, 5, 3, 7, 2, 8, 4),
                List.of(2, 8, 7, 4, 1, 9, 6, 3, 5),
                List.of(3, 4, 5, 2, 8, 6, 1, 7, 9)
        );

        System.out.println(isValidSudoku(sudoku1));  // return 1 (true)
        System.out.println(isValidSudoku(sudoku2));  // return 0 (false)
    }
}
