package com.coding.challenges.leetcode.byNumber;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class $001TwoSumTest {

    public static final $0001TwoSum twoSum = new $0001TwoSum();

    @Test
    public void test271115() {
        int[] result = twoSum.twoSum(new int[]{2, 7, 11, 15}, 9);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    public void test324() {
        int[] result = twoSum.twoSum(new int[]{3, 2, 4}, 6);
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    public void test33() {
        int[] result = twoSum.twoSum(new int[]{3, 3}, 6);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    public void test271115HashMap() {
        int[] result = twoSum.twoSumHashMap(new int[]{2, 7, 11, 15}, 9);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    public void test324HashMap() {
        int[] result = twoSum.twoSumHashMap(new int[]{3, 2, 4}, 6);
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    public void test33HashMap() {
        int[] result = twoSum.twoSumHashMap(new int[]{3, 3}, 6);
        assertArrayEquals(new int[]{0, 1}, result);
    }
}
