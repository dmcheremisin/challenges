package com.coding.challenges.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestSubstringTest {

    LongestSubstring longestSubstring = new LongestSubstring();

    @Test
    public void lengthOfLongestSubstringAbc() {
        String str = "abcabcbb";
        int length = longestSubstring.lengthOfLongestSubstring(str);
        assertEquals(3, length);
    }

    @Test
    public void lengthOfLongestSubstringBbb() {
        String str = "bbbbb";
        int length = longestSubstring.lengthOfLongestSubstring(str);
        assertEquals(1, length);
    }

    @Test
    public void lengthOfLongestSubstringPww() {
        String str = "pwwkew";
        int length = longestSubstring.lengthOfLongestSubstring(str);
        assertEquals(3, length);
    }
}