package com.coding.challenges.codeSignal;

//Let's say a triple (a, b, c) is a zigzag if either a < b > c or a > b < c.
//
//Given an array of integers numbers, your task is to check all the triples of its consecutive elements for being a zigzag. More formally, your task is to construct an array of length numbers.length - 2, where the ith element of the output array equals 1 if the triple (numbers[i], numbers[i + 1], numbers[i + 2]) is a zigzag, and 0 otherwise.
//
//Example
//
//For numbers = [1, 2, 1, 3, 4], the output should be solution(numbers) = [1, 1, 0].
//
//(numbers[0], numbers[1], numbers[2]) = (1, 2, 1) is a zigzag, because 1 < 2 > 1;
//(numbers[1], numbers[2] , numbers[3]) = (2, 1, 3) is a zigzag, because 2 > 1 < 3;
//(numbers[2], numbers[3] , numbers[4]) = (1, 3, 4) is not a zigzag, because 1 < 3 < 4;
//For numbers = [1, 2, 3, 4], the output should be solution(numbers) = [0, 0];
//
//Since all the elements of numbers are increasing, there are no zigzags.
//
//For numbers = [1000000000, 1000000000, 1000000000], the output should be solution(numbers) = [0].
//
//Since all the elements of numbers are the same, there are no zigzags.
public class Zigzag {
    int[] solution(int[] numbers) {
        int[] solution = new int[numbers.length - 2];
        for(int i = 1; i < numbers.length - 1; i++) {
            int first = numbers[i - 1];
            int middle = numbers[i];
            int last = numbers[i+1];
            if((first < middle && middle > last) || (first > middle && middle < last)) {
                solution[i-1] = 1;
            } else {
                solution[i-1] = 0;
            }
        }

        return solution;
    }

}
