package com.coding.challenges.leetcode.challenge092020;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HouseRobberSmartTest {

    private final HouseRobberSmart houseRobberSmart = new HouseRobberSmart();

    @Test
    public void rob1() {
        int robbed = houseRobberSmart.rob(new int[]{1, 2});
        assertEquals(2, robbed);
    }

    @Test
    public void rob2() {
        int robbed = houseRobberSmart.rob(new int[]{1, 2, 3, 1});
        assertEquals(4, robbed);
    }

    @Test
    public void rob3() {
        int robbed = houseRobberSmart.rob(new int[]{2, 7, 9, 3, 1});
        assertEquals(12, robbed);
    }

    @Test
    public void rob4() {
        int robbed = houseRobberSmart.rob(new int[]{2, 1, 1, 2});
        assertEquals(4, robbed);
    }

    @Test
    public void rob5() {
        int robbed = houseRobberSmart.rob(new int[]{4, 1, 2, 7, 5, 3, 1});
        assertEquals(14, robbed);
    }

    @Test
    public void rob6() {
        int robbed = houseRobberSmart.rob(new int[]{183, 219, 57, 193, 94, 233, 202, 154, 65, 240, 97, 234, 100, 249, 186,
                66, 90, 238, 168, 128, 177, 235, 50, 81, 185, 165, 217, 207, 88, 80, 112, 78, 135, 62, 228, 247, 211});
        assertEquals(3365, robbed);
    }

    @Test
    public void rob7() {
        int robbed = houseRobberSmart.rob(new int[]{226, 174, 214, 16, 218, 48, 153, 131, 128, 17, 157, 142, 88, 43, 37,
                157, 43, 221, 191, 68, 206, 23, 225, 82, 54, 118, 111, 46, 80, 49, 245, 63, 25, 194, 72, 80, 143, 55,
                209, 18, 55, 122, 65, 66, 177, 101, 63, 201, 172, 130, 103, 225, 142, 46, 86, 185, 62, 138, 212, 192,
                125, 77, 223, 188, 99, 228, 90, 25, 193, 211, 84, 239, 119, 234, 85, 83, 123, 120, 131, 203, 219, 10,
                82, 35, 120, 180, 249, 106, 37, 169, 225, 54, 103, 55, 166, 124});
        assertEquals(7102, robbed);
    }

    @Test
    public void rob8() {
        int robbed = houseRobberSmart.rob(new int[]{});
        assertEquals(0, robbed);
    }

    @Test
    public void rob9() {
        int robbed = houseRobberSmart.rob(new int[]{0});
        assertEquals(0, robbed);
    }

    @Test
    public void rob10() {
        int robbed = houseRobberSmart.rob(new int[]{1, 1, 3, 6, 7, 10, 7, 1, 8, 5, 9, 1, 4, 4, 3});
        assertEquals(42, robbed);
    }

}