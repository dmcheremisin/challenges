package com.coding.challenges.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringToInteger2Test {

    private StringToInteger2 strToInt;

    @Before
    public void setUp() throws Exception {
        strToInt = new StringToInteger2();
    }
    @Test
    public void myAtoiWithWords() {
        assertEquals(4193, strToInt.myAtoi("4193 with words"));
    }
    @Test
    public void myAtoiNegative() {
        assertEquals(-42, strToInt.myAtoi("   -42"));
    }
    @Test
    public void myAtoiWordsBefore() {
        assertEquals(0, strToInt.myAtoi("words and 987"));
    }
    @Test
    public void myAtoiEmpty() {
        assertEquals(0, strToInt.myAtoi(""));
    }
    @Test
    public void myAtoiPlusOne() {
        assertEquals(1, strToInt.myAtoi("+1"));
    }
    @Test
    public void myAtoiPlusMinusOne() {
        assertEquals(0, strToInt.myAtoi("+-1"));
    }
    @Test
    public void myAtoiVeryBig() {
        assertEquals(Integer.MAX_VALUE, strToInt.myAtoi("20000000000000000000"));
    }
    @Test
    public void myAtoiSignSpaceNumber() {
        assertEquals(0, strToInt.myAtoi("-   234"));
    }
    @Test
    public void myAtoiSpaceSignNumberSpace() {
        assertEquals(-88827, strToInt.myAtoi("    -88827   5655  U"));
    }
}