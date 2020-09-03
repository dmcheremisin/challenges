package com.coding.challenges.leetcode;

import java.util.ArrayList;
import java.util.List;

//Given a 32-bit signed integer, reverse digits of an integer.
//Example 1:
//Input: 123
//Output: 321
//Example 2:
//Input: -123
//Output: -321
//Example 3:
//Input: 120
//Output: 21
//Note:
//Assume we are dealing with an environment which could only store integers within the 32-bit signed integer
//range: [−231,  231 − 1]. For the purpose of this problem, assume that
//your function returns 0 when the reversed integer overflows.

public class ReverseInteger1 {

    public static void main(String[] args) {
        System.out.println("Reverse: " + reverse(123)); // 321
        System.out.println("Reverse: " + reverse(-123)); // -321
        System.out.println("Reverse: " + reverse(120)); // 21
        System.out.println("Reverse: " + reverse(10)); // 1
        System.out.println("Reverse: " + reverse(1534236469)); // 0
    }

    public static int reverse(int x) {
        if (x > -10 && x < 10)
            return x;

        long result = 0;
        List<Integer> nums = new ArrayList<>();
        while (x < -9 || x > 9) {
            nums.add(x % 10);
            x /= 10;
        }
        nums.add(x);

        int numsSize = nums.size();
        for (int i = 0; i < numsSize; i++)
            result += nums.get(i) * Math.pow(10, numsSize - i - 1);

        return result > Integer.MAX_VALUE || result < Integer.MIN_VALUE ? 0 : (int) result;
    }
}
