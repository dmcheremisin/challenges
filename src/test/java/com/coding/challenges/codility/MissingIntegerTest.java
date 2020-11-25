package com.coding.challenges.codility;

import org.junit.Test;

import static org.junit.Assert.*;

public class MissingIntegerTest {

    private final MissingInteger missingInteger = new MissingInteger();

    @Test
    public void negative() {
        assertEquals(1, missingInteger.solution(-1, -4, -2));
    }

    @Test
    public void positive1() {
        assertEquals(3, missingInteger.solution(1, 4, 2));
    }

    @Test
    public void positive2() {
        assertEquals(1, missingInteger.solution(4, 2, 150));
    }

    @Test
    public void positive3() {
        assertEquals(3, missingInteger.solution(150, 2, 4, 1));
    }

    @Test
    public void positiveNegative1() {
        assertEquals(2, missingInteger.solution(-10, -20, -3, 1));
    }

    @Test
    public void positiveNegative2() {
        assertEquals(1, missingInteger.solution(-10, -20, -3, 2));
    }

    @Test
    public void positiveNegative3() {
        assertEquals(1, missingInteger.solution(-10, -20, -3, 2, 4));
    }

    @Test
    public void positiveNegative4() {
        assertEquals(2, missingInteger.solution(-10, -20, -3, 1, 4));
    }
}