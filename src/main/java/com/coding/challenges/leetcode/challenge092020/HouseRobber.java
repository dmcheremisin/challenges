package com.coding.challenges.leetcode.challenge092020;

import java.util.Set;
import java.util.TreeSet;

public class HouseRobber {

    public static void main(String[] args) {
        HouseRobber houseRobber = new HouseRobber();
        int robbed = houseRobber.rob(new int[]{226, 174, 214, 16, 218, 48, 153, 131, 128, 17, 157, 142, 88, 43, 37,
                157, 43, 221, 191, 68, 206, 23, 225, 82, 54, 118, 111, 46, 80, 49, 245, 63, 25, 194, 72, 80, 143, 55,
                209, 18, 55, 122, 65, 66, 177, 101, 63, 201, 172, 130, 103, 225, 142, 46, 86, 185, 62, 138, 212, 192,
                125, 77, 223, 188, 99, 228, 90, 25, 193, 211, 84, 239, 119, 234, 85, 83, 123, 120, 131, 203, 219, 10,
                82, 35, 120, 180, 249, 106, 37, 169, 225, 54, 103, 55, 166, 124});
    }

    public int rob(int[] nums) {
        int length = nums.length;
        if (length == 0)
            return 0;
        if (length == 1)
            return nums[0];

//        TreeSet<Integer> sums = new TreeSet<>();
//        recursiveSum(nums, 0, 0, sums, length);
//        recursiveSum(nums, 1, 0, sums, length);
//
//        return sums.pollLast();
        int first = smartSum(nums, 0);
        int second = smartSum(nums, 1);
        return Math.max(first, second);
    }

    private void recursiveSum(int[] nums, int position, int result, Set<Integer> sums, int length) {
        int lastIndex = length - 1;
        if (position > lastIndex)
            return;

        result += nums[position];
        sums.add(result);

        recursiveSum(nums, position + 2, result, sums, length);
        recursiveSum(nums, position + 3, result, sums, length);
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
                recursiveSum(nums, i + 2, i + 7, 0, first);
                recursiveSum(nums, i + 3, i + 7, 0, second);
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