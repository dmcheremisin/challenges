package com.coding.challenges.codility;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayRotationTest {

    ArrayRotation arrayRotation= new ArrayRotation();

    @Test
    public void solution38976() {
        int[] solution = arrayRotation.solution(new int[]{3, 8, 9, 7, 6}, 3);
        assertArrayEquals(new int[]{9, 7, 6, 3, 8}, solution);
    }

    @Test
    public void solution000() {
        int[] solution = arrayRotation.solution(new int[]{0, 0, 0}, 1);
        assertArrayEquals(new int[]{0, 0, 0}, solution);
    }

    @Test
    public void solution1234() {
        int[] solution = arrayRotation.solution(new int[]{1, 2, 3, 4}, 4);
        assertArrayEquals(new int[]{1, 2, 3, 4}, solution);
    }

    @Test
    public void solution12345() {
        int[] solution = arrayRotation.solution(new int[]{1, 2, 3, 4, 5}, 9);
        assertArrayEquals(new int[]{2, 3, 4, 5, 1}, solution);
    }

    @Test
    public void solutionNull() {
        int[] solution = arrayRotation.solution(new int[]{}, 5);
        assertArrayEquals(new int[]{}, solution);
    }

    @Test
    public void solution1() {
        int[] solution = arrayRotation.solution(new int[]{1}, 5);
        assertArrayEquals(new int[]{1}, solution);
    }

    @Test
    public void solutionK0() {
        int[] solution = arrayRotation.solution(new int[]{1, 2, 3}, 0);
        assertArrayEquals(new int[]{1, 2, 3}, solution);
    }
}