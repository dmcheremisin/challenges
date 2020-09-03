package com.coding.challenges.codewars;

//The drawing below gives an idea of how to cut a given "true" rectangle into squares
//("true" rectangle meaning that the two dimensions are different).
//Can you translate this drawing into an algorithm?
//
//You will be given two dimensions
//
//a positive integer length (parameter named lng)
//a positive integer width (parameter named wdth)
//You will return an array or a string:
//
//sqInRect(5, 3) should return [3, 2, 1, 1]
//sqInRect(3, 5) should return [3, 2, 1, 1]

import java.util.ArrayList;
import java.util.List;

public class SquaresInRectagle {

    public static void main(String[] args) {
        List<Integer> squares = sqInRect(5, 3);
        System.out.println(squares); // [3, 2, 1, 1]
    }

    public static List<Integer> sqInRect(int lng, int wdth) {
        if(lng == wdth) return null;
        List<Integer> squares = new ArrayList<>();
        cutToSquares(lng, wdth, squares);
        return squares;
    }

    private static void cutToSquares(int length, int width, List<Integer> squares) {
        if(length == width) {
            squares.add(length);
            return;
        }
        if(length > width) {
            squares.add(width);
            cutToSquares(length - width, width, squares);
        } else {
            squares.add(length);
            cutToSquares(length, width - length, squares);
        }
    }
}
