package com.coding.challenges.leetcode.challenge092020;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxSubArrayTest {

    private MaxSubArray maxSubArray = new MaxSubArray();

    @Test
    public void maxProduct2324() {
        int max = maxSubArray.maxProduct(new int[]{2, 3, -2, 4});
        assertEquals(6, max);
    }

    @Test
    public void maxProduct201() {
        int max = maxSubArray.maxProduct(new int[]{2, 0, -1});
        assertEquals(2, max);
    }

    @Test
    public void maxProduct02() {
        int max = maxSubArray.maxProduct(new int[]{0, 2});
        assertEquals(2, max);
    }

    @Test
    public void maxProduct234() {
        int max = maxSubArray.maxProduct(new int[]{-2, 3, -4});
        assertEquals(24, max);
    }
}