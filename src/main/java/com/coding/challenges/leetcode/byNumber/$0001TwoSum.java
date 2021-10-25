package com.coding.challenges.leetcode.byNumber;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * Example
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class $0001TwoSum {

    /**
     * Simple approach with double iteration over array - slow quadratic time complexity.
     */
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    /**
     * Approach with HashMap and linear time complexity because access item in HashMap O(1).
     */
    public int[] twoSumHashMap(int[] nums, int target) {
        Map<Integer, Integer> diffs = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (diffs.containsKey(num))
                return new int[]{diffs.get(num), i};
            diffs.put(target - num, i);
        }
        return null;
    }
}
