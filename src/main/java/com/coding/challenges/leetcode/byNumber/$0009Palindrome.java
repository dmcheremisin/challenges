package com.coding.challenges.leetcode.byNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Given an integer x, return true if x is palindrome integer.
 * An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.
 *
 * Example 1:
 * Input: x = 121
 * Output: true
 *
 * Example 2:
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 */
public class $0009Palindrome {

    public boolean isPalindrome(int x) {
        String numStr = x + "";
        char[] arr = numStr.toCharArray();
        int length = arr.length;
        for (int i = 0; i < length / 2; i++) {
            if (arr[i] != arr[length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindromeWithoutString(int x) {
        if (x < 0) return false;
        List<Integer> ints = new ArrayList<>();
        while (x > 0) {
            ints.add(x % 10);
            x = x / 10;
        }
        int size = ints.size();
        for (int i = 0; i < size / 2; i++) {
            if (!Objects.equals(ints.get(i), ints.get(size - 1 - i)))
                return false;
        }
        return true;
    }

    public boolean isPalindromeSimple(int x) {
        if(x < 0) return false;
        int y = x;
        int res = 0;
        while(y != 0) {
            res = res * 10 + y % 10;
            y /= 10;
        }
        return x == res;
    }


}
