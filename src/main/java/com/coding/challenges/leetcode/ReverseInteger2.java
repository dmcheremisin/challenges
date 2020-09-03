package com.coding.challenges.leetcode;

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

public class ReverseInteger2 {

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

        String strNum = x + "";
        int strLen = strNum.length();
        boolean lowerZero = false;
        long result = 0;
        for (int i = strLen - 1; i >= 0; i--) {
            char charAt = strNum.charAt(i);
            if(charAt == '-') {
                lowerZero = true;
                continue;
            }
            result += Integer.parseInt(charAt+"") * Math.pow(10, i);
        }
        result = lowerZero ? (result * -1) / 10 : result;
        return result > Integer.MAX_VALUE || result < Integer.MIN_VALUE ? 0 : (int) result;
    }
}
