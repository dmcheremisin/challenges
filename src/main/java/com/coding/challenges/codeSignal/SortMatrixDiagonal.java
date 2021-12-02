package com.coding.challenges.codeSignal;

//Given a square matrix of positive integers a, your task is to sort the numbers in each of its diagonals parallel to the secondary diagonal. Each diagonal should contain the same set of numbers as before, but sorted in ascending order from the bottom-left to top-right.
//
//Example
//
//For
//
//a = [[1, 3, 9, 4],
//     [9, 5, 7, 7],
//     [3, 6, 9, 7],
//     [1, 2, 2, 2]]
//the output should be
//
//solution(a) = [[1, 9, 9, 7],
//                    [3, 5, 6, 9],
//                    [3, 4, 7, 7],
//                    [1, 2, 2, 2]]
//The diagonals parallel to the secondary diagonal in the initial matrix (left-to-right, bottom-to-top) are:
//
//1
//9, 3
//3, 5, 9
//1, 6, 7, 4
//2, 9, 7
//2, 7
//2
//For
//
//a = [[10, 1],
//     [7, 5]]
//the output should be
//
//solution(a) = [[10, 7],
//                    [1, 5]]

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortMatrixDiagonal {

    int[][] solution(int[][] a) {
        int size = a.length;
        for(int i = 0; i < (size * 2 - 1); i++) {
            List<Integer> diagonal = new ArrayList<>();
            int x = i < size ? i : size - 1;
            int y = i < size ? 0 : i - size + 1;
            //System.out.println("i = " + i);
            do {
                System.out.println("x = " + x + " ; y = " + y + " ; a = " + a[x][y]);
                diagonal.add(a[x][y]);
                x--;
                y++;
            } while (x < size && y < size && x >= 0 && y >= 0);
            ///System.out.println("diagonal = " + diagonal);
            diagonal.sort(Comparator.naturalOrder());
            x = i < size ? i : size - 1;
            y = i < size ? 0 : i - size + 1;
            int count = 0;
            do {
                a[x][y] = diagonal.get(count);
                //System.out.println("elem = " + diagonal.get(count));
                x--;
                y++;
                count++;
            } while (x < size && y < size && x >= 0 && y >= 0);
            System.out.println(" ======================= ");
        }
        return a;
    }

}
