package com.coding.challenges.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Friday13Test {

    @Test
    public void unluckyDays() {
        assertEquals(3, Friday13.unluckyDays(2015));
        assertEquals(1, Friday13.unluckyDays(1986));
    }

    @Test
    public void unluckyDaysStream() {
        assertEquals(3, Friday13.unluckyDaysStream(2015));
        assertEquals(1, Friday13.unluckyDaysStream(1986));
    }
}