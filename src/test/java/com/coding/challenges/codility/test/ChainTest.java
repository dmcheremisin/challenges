package com.coding.challenges.codility.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChainTest {

    Chain chain = new Chain();

    @Test
    public void solution1() {
        assertEquals(5, chain.solution(1, 4, 78, 2, 15, 3, 56, 22));
    }

    @Test
    public void solution2() {
        assertEquals(4, chain.solution(3, 3, 3, 1, 3, 3, 3, 3));
    }

    @Test
    public void solution3() {
        assertEquals(4, chain.solution(1, 2, 3, 3, 2, 3, 3, 1));
    }

}