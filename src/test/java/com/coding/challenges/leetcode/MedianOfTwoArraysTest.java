package com.coding.challenges.leetcode;

import org.junit.Test;

import static com.coding.challenges.leetcode.MedianOfTwoArrays.findMedianSortedArrays;
import static org.junit.Assert.assertEquals;

public class MedianOfTwoArraysTest {

    @Test
    public void findMedianSortedArraysTest() {
        assertEquals(2.0, findMedianSortedArrays(new int[]{2}, new int[]{}), 0.1);
        assertEquals(3.0, findMedianSortedArrays(new int[]{}, new int[]{3}), 0.1);
        assertEquals(2.0, findMedianSortedArrays(new int[]{1, 2}, new int[]{3}), 0.1);
        assertEquals(2.5, findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}), 0.1);
        assertEquals(2.5, findMedianSortedArrays(new int[]{}, new int[]{2, 3}), 0.1);
    }
}