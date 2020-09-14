package com.coding.challenges.leetcode.challenge092020;

class MaxSubArray {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int test = nums[i];
            if (test > max)
                max = test;
            for (int j = i + 1; j < nums.length; j++) {
                test *= nums[j];
                if (test > max)
                    max = test;
            }
        }
        return max;
    }
}

//Given an integer array nums, find the contiguous subarray within an array (containing at least one number) which has the largest product.
//
//Example 1:
//
//Input: [2,3,-2,4]
//Output: 6
//Explanation: [2,3] has the largest product 6.
//Example 2:
//
//Input: [-2,0,-1]
//Output: 0
//Explanation: The result cannot be 2, because [-2,-1] is not a subarray.