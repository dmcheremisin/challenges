package com.coding.challenges.leetcode.challenge092020;

import org.junit.Test;

import static org.junit.Assert.*;

public class HouseRobberTest {

    private final HouseRobber houseRobber = new HouseRobber();

    @Test
    public void rob1() {
        int robbed = houseRobber.rob(new int[]{1, 2});
        assertEquals(2, robbed);
    }

    @Test
    public void rob2() {
        int robbed = houseRobber.rob(new int[]{1, 2, 3, 1});
        assertEquals(4, robbed);
    }

    @Test
    public void rob3() {
        int robbed = houseRobber.rob(new int[]{2, 7, 9, 3, 1});
        assertEquals(12, robbed);
    }

    @Test
    public void rob4() {
        int robbed = houseRobber.rob(new int[]{2, 1, 1, 2});
        assertEquals(4, robbed);
    }

    @Test
    public void rob5() {
        int robbed = houseRobber.rob(new int[]{4, 1, 2, 7, 5, 3, 1});
        assertEquals(14, robbed);
    }
}