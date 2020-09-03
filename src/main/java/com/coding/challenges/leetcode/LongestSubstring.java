package com.coding.challenges.leetcode;

class LongestSubstring {
    public static void main(String[] args) {
        LongestSubstring longestSubstring = new LongestSubstring();
        int length = longestSubstring.lengthOfLongestSubstring("abcabcbb");
        System.out.println(length);
    }

    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        String best = "";
        StringBuilder result = new StringBuilder();
        int length = chars.length;
        for(int j = 0; j < length && best.length() < length - j; j++) {
            for(int i = j; i < length; i++) {
                if (result.indexOf(chars[i] + "", 0) == -1){
                    result.append(chars[i]);
                } else {
                    break;
                }
            }
            best = result.length() > best.length() ? result.toString() : best;
            result = new StringBuilder();
        }
        return best.length();
    }

}