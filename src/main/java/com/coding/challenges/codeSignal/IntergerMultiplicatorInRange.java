package com.coding.challenges.codeSignal;

import java.util.ArrayList;
import java.util.List;

// You are given an array of integers a and two integers l and r.
// You task is to calculate a boolean array b,
// where b[i] = true if there exists an integer x, such that a[i] = (i + 1) * x and l ≤ x ≤ r.
// Otherwise, b[i] should be set to false.
//
//Example
//For a = [8, 5, 6, 16, 5], l = 1, and r = 3, the output should be solution(a, l, r) = [false, false, true, false, true].
public class IntergerMultiplicatorInRange {

    boolean[] solution(int[] a, int l, int r) {
        boolean[] result = new boolean[a.length];
        List<Integer> ranges = new ArrayList<>();
        for(int i = l; i <= r; i++) {
            ranges.add(i);
        }

        for(int i = 0; i < a.length; i++) {
            for(Integer range : ranges) {
                if (a[i] == (i + 1) * range) {
                    result[i] = true;
                    break;
                }
            }
        }
        return result;
    }
}
//Input:
//a: [8, 5, 6, 16, 5]
//l: 1
//r: 3
//Expected Output:
//[false, false, true, false, true]
//Input:
//a: [1000000, 20000]
//l: 10000
//r: 10000
//Expected Output:
//[false, true]
