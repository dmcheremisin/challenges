package com.coding.challenges.codility;

import org.junit.Test;

import static org.junit.Assert.*;

public class UnpairedIntegerTest {

    UnpairedInteger unpairedInteger = new UnpairedInteger();

    @Test
    public void solution9393979() {
        assertEquals(7, unpairedInteger.solution(9, 3, 9, 3, 9, 7, 9));
    }

    @Test
    public void solution1() {
        assertEquals(1, unpairedInteger.solution(1));
    }

    @Test
    public void solution5232853() {
        assertEquals(8, unpairedInteger.solution(5, 2, 3, 2, 8, 5, 3));
    }
}