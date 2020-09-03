package com.coding.challenges.codewars;

import java.util.LinkedList;
import java.util.List;

public class CartesianProduct {

    public static void main(String[] args) {
        int[] arr1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Tuple> result = multiply(arr1);
        System.out.println(result);
        System.out.println(result.size()); // 45
    }

    private static List<Tuple> multiply(int[] source) {
        List<Tuple> result = new LinkedList<>();
        for(int i = 0; i < source.length; i++) {
            for(int j = i + 1; j < source.length; j++) {
                result.add(new Tuple(source[i], source[j]));
            }
        }
        return result;
    }

    private static class Tuple {
        private int first;
        private int last;

        public Tuple(int first, int last) {
            this.first = first;
            this.last = last;
        }

        @Override
        public String toString() {
            return "{" + first + ","  + last + '}';
        }
    }
}
