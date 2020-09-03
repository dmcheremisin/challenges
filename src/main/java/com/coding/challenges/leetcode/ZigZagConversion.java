package com.coding.challenges.leetcode;

//The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
// (you may want to display this pattern in a fixed font for better legibility)
//P   A   H   N
//A P L S I I G
//Y   I   R
//And then read line by line: "PAHNAPLSIIGYIR"
//Write the code that will take a string and make this conversion given a number of rows:
//string convert(string s, int numRows);
//Example 1:
//Input: s = "PAYPALISHIRING", numRows = 3
//Output: "PAHNAPLSIIGYIR"
//Example 2:
//Input: s = "PAYPALISHIRING", numRows = 4
//Output: "PINALSIGYAHRPI"
//Explanation:
//P     I    N
//A   L S  I G
//Y A   H R
//P     I
public class ZigZagConversion {

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3)); // PAHNAPLSIIGYIR
        System.out.println(convert("PAYPALISHIRING", 4)); // PINALSIGYAHRPI
        System.out.println(convert("", 2)); //
        System.out.println(convert("AB", 1)); // AB
    }

    public static String convert(String str, int numRows) {
        int length = str.length();
        if (length <= numRows || numRows == 1)
            return str;

        int index = 0, counter = 0;
        boolean direction = true;

        StringBuilder[] strArr = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++)
            strArr[i] = new StringBuilder();

        do {
            strArr[counter].append(str.charAt(index));

            if ((counter == numRows - 1 && direction) || (counter == 0 && !direction))
                direction = !direction;

            counter = direction ? counter + 1 : counter - 1;
        } while (++index < length);

        return String.join("", strArr);
    }
}
