package com.coding.challenges.leetcode;

class LongestPalindrome {

    public String longestPalindrome(String s) {
        int len = s.length();
        String longest = "";
        for(int i = 0; i < len && longest.length() < len - i; i++) {
            for(int j = i + 1; j <= len; j++) {
                if(longest.length() < j - i + 1) {
                    String newStr = s.substring(i, j);
                    if (checkPalindrome(newStr) && newStr.length() > longest.length()) {
                        longest = newStr;
                    }
                }
            }
        }
        return longest;
    }

    public boolean checkPalindrome(String str) {
        int length = str.length();
        for(int i = 0; i < length/2; i++) {
            if(str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
