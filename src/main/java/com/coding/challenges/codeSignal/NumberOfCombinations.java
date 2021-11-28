package com.coding.challenges.codeSignal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Given array "a" and num k. You need to calculate all combinations of a[i] + a[k] == k
// Example 1:
// a: [1, 2, 3, 4, 5], k = 3
// Result: 4
// --------------------------
// Example 2:
// a: [1, 3, 5, 7, 9], k = 2
// Result: 10

public class NumberOfCombinations {

    public int solution(int[] a, int k) {
        List<Integer> rems = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int value : a) {
            int rem = value % k;
            rems.add(rem);
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }

        int count = 0;
        for (int rem: rems) {
            map.put(rem, map.get(rem) - 1);
            int quantity = map.getOrDefault(k - rem, 0);
            count += quantity;
        }
        return count;
    }

}
