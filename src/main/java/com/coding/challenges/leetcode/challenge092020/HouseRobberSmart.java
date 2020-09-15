package com.coding.challenges.leetcode.challenge092020;

import java.util.Set;
import java.util.TreeSet;

public class HouseRobberSmart {

    public int rob(int[] nums) {
        int length = nums.length;
        if (length == 0)
            return 0;
        if (length == 1)
            return nums[0];
        if (length == 2)
            return Math.max(nums[0], nums[1]);

        int first = smartSum(nums, 0);
        int second = smartSum(nums, 1);
        return Math.max(first, second);
    }

    private int smartSum(int[] nums, int i) {
        int length = nums.length;
        int sum = nums[i];
        while (i + 2 < length) {
            if (i + 3 > length - 1) {
                i += 2;
            } else {
                TreeSet<Integer> first = new TreeSet<>();
                TreeSet<Integer> second = new TreeSet<>();
                recursiveSum(nums, i + 2, i + 20, 0, first);
                recursiveSum(nums, i + 3, i + 20, 0, second);
                boolean firstIsBigger = first.pollLast() > second.pollLast();
                i = i + (firstIsBigger ? 2 : 3);
            }
            sum += nums[i];
        }
        return sum;
    }

    private void recursiveSum(int[] nums, int start, int end, int sum, Set<Integer> sums) {
        if (start > end)
            return;

        sum += nums[start];
        sums.add(sum);

        if (start + 2 < nums.length)
            recursiveSum(nums, start + 2, end, sum, sums);
        if (start + 3 < nums.length)
            recursiveSum(nums, start + 3, end, sum, sums);
    }
}

//You are a professional robber planning to rob houses along a street. Each house has a certain amount of money
// stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system
// connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
//
//Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount
// of money you can rob tonight without alerting the police.
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