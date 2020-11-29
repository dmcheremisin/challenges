package com.coding.challenges.codility.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniqueStringTest {

    UniqueString us = new UniqueString();

    @Test
    public void solutionExample() {
        assertEquals(4, us.solution("example"));
    }

    @Test
    public void solutionSun() {
        assertEquals(2, us.solution("sun"));
    }

    @Test
    public void solutionElephant() {
        assertEquals(5, us.solution("elephant"));
    }

    @Test
    public void solutionApple() {
        assertEquals(2, us.solution("apple"));
    }

    @Test
    public void solutionAssessment() {
        assertEquals(3, us.solution("assessment"));
    }

}