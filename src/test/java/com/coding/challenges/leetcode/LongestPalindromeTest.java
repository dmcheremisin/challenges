package com.coding.challenges.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPalindromeTest {

    LongestPalindrome longestPalindrome = new LongestPalindrome();

    @Test
    public void checkPalindrome() {
        assertTrue(longestPalindrome.checkPalindrome("aabbaa"));
        assertTrue(longestPalindrome.checkPalindrome("aba"));
        assertTrue(longestPalindrome.checkPalindrome("aa"));
        assertFalse(longestPalindrome.checkPalindrome("aabsdfsdbaa"));
        assertFalse(longestPalindrome.checkPalindrome("abc"));
        assertFalse(longestPalindrome.checkPalindrome("cdece"));
    }

    @Test
    public void longestPalindrome1() {
        String result = longestPalindrome.longestPalindrome("babad");
        assertEquals("bab", result);
    }

    @Test
    public void longestPalindrome2() {
        String result = longestPalindrome.longestPalindrome("cbbd");
        assertEquals("bb", result);
    }

    @Test
    public void longestPalindrome3() {
        String result = longestPalindrome.longestPalindrome("bb");
        assertEquals("bb", result);
    }

    @Test
    public void longestPalindrome4() {
        String result = longestPalindrome.longestPalindrome("abacab");
        assertEquals("bacab", result);
    }


}