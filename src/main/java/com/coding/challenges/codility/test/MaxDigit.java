package com.coding.challenges.codility.test;

import java.util.TreeSet;

public class MaxDigit {

    public static void main(String[] args) {
        System.out.println(new MaxDigit().solution("50552"));
    }

    public int solution(String S) {
        if (S == null || S.isBlank())
            throw new IllegalArgumentException("Input must not be null or empty");

        int length = S.length();
        if (length <= 2)
            return Integer.parseInt(S);

        var digits = new TreeSet<Integer>();
        for (int i = 0; i < length - 1; i++) {
            String substring = S.substring(i, i + 2);
            digits.add(Integer.parseInt(substring));
        }

        return digits.pollLast();
    }

}
