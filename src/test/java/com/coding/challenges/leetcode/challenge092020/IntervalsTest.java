package com.coding.challenges.leetcode.challenge092020;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntervalsTest {

    private final Intervals intervals = new Intervals();

    @Test
    public void insertTest1() {
        int[][] arrayForTest = {{1, 3}, {6, 9}};
        int[] interval = {2, 5};
        int[][] actual = intervals.insert(arrayForTest, interval);

        int[][] expected = {{1, 5}, {6, 9}};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void insertTest2() {
        int[][] arrayForTest = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] interval = {4, 8};
        int[][] actual = intervals.insert(arrayForTest, interval);

        int[][] expected = {{1, 2}, {3, 10}, {12, 16}};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void insertTest3() {
        int[][] arrayForTest = {};
        int[] interval = {5, 7};
        int[][] actual = intervals.insert(arrayForTest, interval);

        int[][] expected = {interval};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void insertTest4() {
        int[][] arrayForTest = {{1, 5}};
        int[] interval = {6, 8};
        int[][] actual = intervals.insert(arrayForTest, interval);

        int[][] expected = {{1, 5}, {6, 8}};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void insertTest5() {
        int[][] arrayForTest = {{1, 3}, {4, 6}};
        int[] interval = {7, 9};
        int[][] actual = intervals.insert(arrayForTest, interval);

        int[][] expected = {{1, 3}, {4, 6}, {7, 9}};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void insertTest6() {
        int[][] arrayForTest = {{1, 5}};
        int[] interval = {2, 3};
        int[][] actual = intervals.insert(arrayForTest, interval);

        int[][] expected = {{1, 5}};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void insertTest7() {
        int[][] arrayForTest = {{1, 5}};
        int[] interval = {0, 3};
        int[][] actual = intervals.insert(arrayForTest, interval);

        int[][] expected = {{0, 5}};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void insertTest8() {
        int[][] arrayForTest = {{1, 5}};
        int[] interval = {0, 0};
        int[][] actual = intervals.insert(arrayForTest, interval);

        int[][] expected = {{0, 0}, {1, 5}};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void insertTest9() {
        int[][] arrayForTest = {{1, 5}, {6, 8}};
        int[] interval = {0, 9};
        int[][] actual = intervals.insert(arrayForTest, interval);

        int[][] expected = {{0, 9}};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void insertTest10() {
        int[][] arrayForTest = {{0, 5}, {9, 12}};
        int[] interval = {7, 16};
        int[][] actual = intervals.insert(arrayForTest, interval);

        int[][] expected = {{0, 5}, {7, 16}};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void insertTest11() {
        int[][] arrayForTest = {{0, 7}, {8, 8}, {9, 11}};
        int[] interval = {4, 13};
        int[][] actual = intervals.insert(arrayForTest, interval);

        int[][] expected = {{0, 13}};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void insertTest12() {
        int[][] arrayForTest = {{3, 5}, {12, 15}};
        int[] interval = {6, 6};
        int[][] actual = intervals.insert(arrayForTest, interval);

        int[][] expected = {{3, 5}, {6, 6}, {12, 15}};
        assertArrayEquals(expected, actual);
    }
}