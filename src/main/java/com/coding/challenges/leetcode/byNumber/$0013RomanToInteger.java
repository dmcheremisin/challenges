package com.coding.challenges.leetcode.byNumber;

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * <p>
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II.
 * The number 27 is written as XXVII, which is XX + V + II.
 * <p>
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII.
 * Instead, the number four is written as IV. Because the one is before the five we subtract it making four.
 * The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 * <p>
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given a roman numeral, convert it to an integer.
 */

import java.util.Map;

public class $0013RomanToInteger {

    public static final Map<Character, Integer> SYMBOLS = Map.of('I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000);

    public int romanToInt(String s) {
        Integer result = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            Character c = s.charAt(i);
            if (i == len - 1) {
                result += SYMBOLS.get(c);
                break;
            }

            char nextC = s.charAt(i + 1);
            if (c == 'C') {
                if (nextC == 'D' || nextC == 'M') {
                    result += (SYMBOLS.get(nextC) - SYMBOLS.get(c));
                    i++;
                } else {
                    result += SYMBOLS.get(c);
                }
                continue;
            }

            if (c == 'X') {
                if (nextC == 'L' || nextC == 'C') {
                    result += (SYMBOLS.get(nextC) - SYMBOLS.get(c));
                    i++;
                } else {
                    result += SYMBOLS.get(c);
                }
                continue;
            }

            if (c == 'I') {
                if (nextC == 'V' || nextC == 'X') {
                    result += (SYMBOLS.get(nextC) - SYMBOLS.get(c));
                    i++;
                } else {
                    result += SYMBOLS.get(c);
                }
                continue;
            }

            result += SYMBOLS.get(c);
        }

        return result;
    }
}
