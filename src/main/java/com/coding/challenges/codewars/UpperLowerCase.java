package com.coding.challenges.codewars;

//In this Kata, you will be given a string that may have mixed uppercase and lowercase letters and your task is
//to convert that string to either lowercase only or uppercase only based on:
//  -  make as few changes as possible.
//  -  if the string contains equal number of uppercase and lowercase letters, convert the string to lowercase.
//For example:
//solve("coDe") = "code". Lowercase characters > uppercase. Change only the "D" to lowercase.
//solve("CODe") = "CODE". Uppercase characters > lowecase. Change only the "e" to uppercase.
//solve("coDE") = "code". Upper == lowercase. Change all to lowercase.

public class UpperLowerCase {
    public static void main(String[] args) {
        System.out.println(solve("CODe"));
    }

    public static String solve(final String str) {
        int border = "a".codePointAt(0);
        int lower = 0, upper = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= border)
                lower++;
            else
                upper++;
        }
        return lower >= upper ? str.toLowerCase() : str.toUpperCase();
    }
}
