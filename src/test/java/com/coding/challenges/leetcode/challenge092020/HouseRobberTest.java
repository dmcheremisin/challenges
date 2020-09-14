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

    @Test
    public void rob6() {
        int robbed = houseRobber.rob(new int[]{183, 219, 57, 193, 94, 233, 202, 154, 65, 240, 97, 234, 100, 249, 186,
                66, 90, 238, 168, 128, 177, 235, 50, 81, 185, 165, 217, 207, 88, 80, 112, 78, 135, 62, 228, 247, 211});
        assertEquals(3365, robbed);
    }
}