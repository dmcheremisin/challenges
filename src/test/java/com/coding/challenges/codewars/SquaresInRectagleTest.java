package com.coding.challenges.codewars;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SquaresInRectagleTest {

    @Test
    public void test1() {
        List<Integer> res = new ArrayList<>(Arrays.asList(3, 2, 1, 1));
        assertEquals(res, SquaresInRectagle.sqInRect(5, 3));
    }
    @Test
    public void test2() {
        assertEquals(null, SquaresInRectagle.sqInRect(5, 5));
    }
}