package com.coding.challenges.codeSignal;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfCombinationsTest {

    public NumberOfCombinations numberOfCombinations = new NumberOfCombinations();

    @Test
    public void test1() {
        int result = numberOfCombinations.solution(new int[]{1, 2, 3, 4, 5}, 3);
        assertEquals(4, result);
    }

    @Test
    public void test2() {
        int result = numberOfCombinations.solution(new int[]{1, 3, 5, 7, 9}, 2);
        assertEquals(10, result);
    }
}