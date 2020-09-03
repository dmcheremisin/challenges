package com.coding.challenges.leetcode;

import org.junit.Test;

import static com.coding.challenges.leetcode.ZigZagConversion.convert;
import static org.junit.Assert.assertEquals;

public class ZigZagConversionTest {

    @Test
    public void convertTest() {
        assertEquals(convert("PAYPALISHIRING", 3), "PAHNAPLSIIGYIR");
        assertEquals(convert("PAYPALISHIRING", 4), "PINALSIGYAHRPI");
        assertEquals(convert("", 2), "");
        assertEquals(convert("AB", 1), "AB");
    }


}