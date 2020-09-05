package com.coding.challenges.leetcode;
// Example 1:
// Input: "42"
//Output: 42

// Example 2:
//Input: "   -42"
//Output: -42
//Explanation: The first non-whitespace character is '-', which is the minus sign.
//             Then take as many numerical digits as possible, which gets 42.

import java.math.BigInteger;

// Example 3:
//Input: "4193 with words"
//Output: 4193
//Explanation: Conversion stops at digit '3' as the next character is not a numerical digit.
//
// Example 4:
//Input: "words and 987"
//Output: 0
//Explanation: The first non-whitespace character is 'w', which is not a numerical
//             digit or a +/- sign. Therefore no valid conversion could be performed.
//
// Example 5:
//Input: "-91283472332"
//Output: -2147483648
//Explanation: The number "-91283472332" is out of the range of a 32-bit signed integer.
//             Thefore INT_MIN (−231) is returned.
public class StringToInteger {

    private static boolean digitsPresent(StringBuilder str) {
        return str.length() > 0;
    }

    private static boolean isSign(char aChar) {
        return aChar == '-' || aChar == '+';
    }

    private static boolean isDigit(char aChar) {
        return aChar >= 48 && aChar <= 57;
    }

    private static boolean isWhitespace(char aChar) {
        return aChar == ' ';
    }

    public int myAtoi(String str) {
        char[] chars = str.toCharArray();
        StringBuilder digitStr = new StringBuilder();
        BigInteger negative = new BigInteger("1");
        int signCounter = 0;

        for(int i = 0; i < chars.length; i++) {
            char current = chars[i];
            if (isWhitespace(current)) {
                if(signCounter > 0)
                    break;
                if(digitsPresent(digitStr)) {
                    break;
                }
                continue;
            }
            if (isSign(current)) {
                signCounter++;
                if(digitsPresent(digitStr)) {
                    break;
                }
                negative = current == '-' ? new BigInteger("-1") : new BigInteger("1");
                if(signCounter > 1)
                    return 0;
                continue;
            }
            if (isDigit(current)){
                digitStr.append(current);
                continue;
            }
            if (!digitsPresent(digitStr)) {
                return 0;
            }
            break;
        }
        BigInteger bi = digitStr.length() != 0 ? new BigInteger(digitStr.toString()).multiply(negative) : BigInteger.ZERO;
        if(bi.compareTo(new BigInteger(Integer.MAX_VALUE +"")) > 0) return Integer.MAX_VALUE;
        if(bi.compareTo(new BigInteger(Integer.MIN_VALUE +"")) < 0) return Integer.MIN_VALUE;
        return bi.intValue();
    }
}
