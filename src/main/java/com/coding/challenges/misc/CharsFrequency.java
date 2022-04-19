package com.coding.challenges.misc;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CharsFrequency {

    public static void main(String[] args) {
        String str = "sdfasdfsdfa";
        char[] chars = str.toCharArray();
        Map<Character, Integer> frequency = getFrequency(chars);
        System.out.println(frequency);
        for(Character ch : frequency.keySet()) {
            System.out.println(ch + " : " + frequency.get(ch));
        }
        Map<Integer, Character> sorted = new TreeMap<>();
        frequency.forEach((ch, i) -> sorted.put(i, ch));
        System.out.println(sorted);
    }

    public static Map<Character, Integer> getFrequency(char[] chars) {
        Map<Character, Integer> fr = new HashMap<>();
        for(int i = 0; i < chars.length; i++) {
            fr.put(chars[i], fr.getOrDefault(chars[i], 0) + 1);
        }
        return fr;
    }
}
