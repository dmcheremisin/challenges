package com.coding.challenges.codeSignal;

import java.util.HashSet;
import java.util.Set;

//You are given two integers, n and k.
// Consider the string representation of n, and find the number of distinct substrings of length k,
// such that n is divisible by the number formed by that substring.
// In other words, how many different numbers formed by k consecutive digits of n are factors of n?
//
//Note: The k-digit substrings may have leading zeros.
//Examples
//
//For n = 120 and k = 2, the output should be solution(n, k) = 2.
//The divisor substrings are 12 and 20 (120 is divisible by both of these).

//For n = 555 and k = 1, the output should be solution(n, k) = 1.
//All the substrings of length 1 are equal to 5 which is a divisor of 555. The answer is not 3 since we're only counting distinct numbers.
//
//For n = 5341 and k = 2, the output should be solution(n, k) = 0.
//5341 is not divisible by 53, 34 nor 41, so the answer is 0.

public class FactorsOfInteger {

    int solution(int n, int k) {
        Set<Integer> ints = new HashSet<>();
        String str = n + "";
        System.out.println("Str: " + str);
        for(int i = 0; i <= str.length() - k; i++) {
            System.out.println("i: " + i + "; k: " + k);
            String sub = str.substring(i, i + k);
            System.out.println("Substring: " + sub);
            int integ = Integer.parseInt(sub);
            System.out.println("Integer: " + integ);
            if (integ != 0)
                ints.add(integ);
        }

        int count = 0;
        for(Integer i : ints) {
            if(n % i == 0) count++;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
