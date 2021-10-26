package com.coding.challenges.leetcode.byNumber;

import org.junit.Test;

import static org.junit.Assert.*;

public class $0009PalindromeTest {

    private static final $0009Palindrome palindrome = new $0009Palindrome();

    @Test
    public void test121() {
        assertTrue(palindrome.isPalindromeSimple(121));
    }

    @Test
    public void testNegative121() {
        assertFalse(palindrome.isPalindromeSimple(-121));
    }

    @Test
    public void test10() {
        assertFalse(palindrome.isPalindromeSimple(10));
    }

    @Test
    public void test1234321() {
        assertTrue(palindrome.isPalindromeSimple(1234321));
    }

    @Test
    public void testNegative101() {
        assertFalse(palindrome.isPalindromeSimple(-101));
    }


}
