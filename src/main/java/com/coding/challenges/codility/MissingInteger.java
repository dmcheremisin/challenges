package com.coding.challenges.codility;

import java.util.Arrays;

//Write a function:
//
//class Solution { public int solution(int[] A); }
//
//that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
//
//For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
//
//Given A = [1, 2, 3], the function should return 4.
//
//Given A = [−1, −3], the function should return 1.
//
//Write an efficient algorithm for the following assumptions:
//
//N is an integer within the range [1..100,000];
//each element of array A is an integer within the range [−1,000,000..1,000,000].

public class MissingInteger {

    public int solution(int... A) {
        int length = A.length;
        if (length == 0)
            return 1;
        if (length == 1)
            return A[0] == 1 ? A[0] + 1 : 1;

        Arrays.sort(A);
        if (A[length - 1] < 0)
            return 1;
        if (A[0] > 0 && A[0] > 1)
            return 1;

        int result = 1;
        boolean found = false;

        for (int i = 1; i < length; i++) {
            int previous = A[i - 1];
            int current = A[i];
            if (current > 0 && previous < 0) {
                if (current > 1) {
                    found = true;
                    break;
                }
            }

            if (current > 0 && previous > 0 && current - previous > 1) {
                result = previous + 1;
                found = true;
                break;
            }
        }

        return found ? result : A[length - 1] + 1;
    }
}
