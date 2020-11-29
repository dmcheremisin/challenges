package com.coding.challenges.codility.test;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxDigitTest {

    MaxDigit maxDigit = new MaxDigit();

    @Test
    public void solution50552() {
        int solution = maxDigit.solution("50552");
        assertEquals(55, solution);
    }

    @Test
    public void solution10101() {
        int solution = maxDigit.solution("10101");
        assertEquals(10, solution);
    }

    @Test
    public void solution88() {
        int solution = maxDigit.solution("88");
        assertEquals(88, solution);
    }

    @Test
    public void solution1() {
        int solution = maxDigit.solution("1");
        assertEquals(1, solution);
    }

    @Test
    public void solution12() {
        int solution = maxDigit.solution("12");
        assertEquals(12, solution);
    }

    @Test
    public void solution123() {
        int solution = maxDigit.solution("123");
        assertEquals(23, solution);
    }

    @Test
    public void solution03() {
        int solution = maxDigit.solution("03");
        assertEquals(3, solution);
    }
}