package com.coding.challenges.leetcode.challenge092020;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HouseRobber {

    public int rob(int[] nums) {
        int length = nums.length;
        if (length == 0)
            return 0;

        TreeSet<Integer> sums = new TreeSet<>();
        recursiveSum(nums, 0, 0, sums, length);
        recursiveSum(nums, 1, 0, sums, length);

        return sums.pollLast();
    }

    private void recursiveSum(int[] nums, int position, int result, Set<Integer> sums, int length) {
        if (position >= length - 1) {
            sums.add(result);
            return;
        }
        result += nums[position];
        recursiveSum(nums, position + 2, result, sums, length);
        recursiveSum(nums, position + 3, result, sums, length);
    }
}