package com.coding.challenges.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CartesianProductRecursion {

    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5}, {6,7,8}};
        List<int[]> ints = cartesianProduct(arr, 0, new int[arr.length], new ArrayList<>());
        ints.forEach(i -> {
            Arrays.stream(i).forEach(System.out::print);
            System.out.println();
        });

    }

    private static List<int[]> cartesianProduct(int[][] arr, int level, int[] cp, List<int[]> result) {
        if(level >= arr.length) {
            result.add(cp);
            return result;
        }
        for(int i = 0; i < arr[level].length; i++) {
            cp[level] = arr[level][i];
            cartesianProduct(arr, level + 1, cp.clone(), result);
        }
        return result;
    }
}
