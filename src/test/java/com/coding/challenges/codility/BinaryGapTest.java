package com.coding.challenges.codility;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryGapTest {

    BinaryGap binaryGap = new BinaryGap();

    @Test
    public void solutionTest9() {
        assertEquals(2, binaryGap.solution(9));
    }

    @Test
    public void solutionTest529() {
        assertEquals(4, binaryGap.solution(529));
    }

    @Test
    public void solutionTest20() {
        assertEquals(1, binaryGap.solution(20));
    }

    @Test
    public void solutionTest15() {
        assertEquals(0, binaryGap.solution(15));
    }

    @Test
    public void solutionTest32() {
        assertEquals(0, binaryGap.solution(32));
    }

    @Test
    public void solutionTest0() {
        assertEquals(0, binaryGap.solution(0));
    }
}