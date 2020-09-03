package com.coding.challenges.codewars;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class XbonacciTest {
    private Xbonacci xbonacci;

    @Before
    public void setUp() throws Exception {
        xbonacci = new Xbonacci();
    }

    @Test
    public void tribonacciRecursive() {
        assertArrayEquals(new int []{1,1,1,3,5,9,17,31,57,105}, xbonacci.tribonacciRecursive(new int []{1,1,1},10));
        assertArrayEquals(new int []{0,0,1,1,2,4,7,13,24,44}, xbonacci.tribonacciRecursive(new int []{0,0,1},10));
        assertArrayEquals(new int []{0,1,1,2,4,7,13,24,44,81}, xbonacci.tribonacciRecursive(new int []{0,1,1},10));
    }

    @Test
    public void tribonacciCycle() {
        assertArrayEquals(new int []{1,1,1,3,5,9,17,31,57,105}, xbonacci.tribonacciCycle(new int []{1,1,1},10));
        assertArrayEquals(new int []{0,0,1,1,2,4,7,13,24,44}, xbonacci.tribonacciCycle(new int []{0,0,1},10));
        assertArrayEquals(new int []{0,1,1,2,4,7,13,24,44,81}, xbonacci.tribonacciCycle(new int []{0,1,1},10));
    }
}