package com.coding.challenges.leetcode.challenge092020;

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
        int lastIndex = length - 1;
        if (position > lastIndex)
            return;

        result += nums[position];
        sums.add(result);

        for (int i = 2; position + i <= lastIndex; i++)
            recursiveSum(nums, position + i, result, sums, length);
    }
}

//You are a professional robber planning to rob houses along a street. Each house has a certain amount of money
// stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system
// connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
//
//Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount
// of money you can rob tonight without alerting the police.
//
//
//
//Example 1:
//
//Input: nums = [1,2,3,1]
//Output: 4
//Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
//             Total amount you can rob = 1 + 3 = 4.
//Example 2:
//
//Input: nums = [2,7,9,3,1]
//Output: 12
//Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
//             Total amount you can rob = 2 + 9 + 1 = 12.
//
//
//Constraints:
//
//0 <= nums.length <= 100
//0 <= nums[i] <= 400