package com.coding.challenges.misc;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class TopCharacters {

    private static class Node {
        Character letter;
        BigDecimal frequency;

        Node(Character letter, BigDecimal frequency) {
            this.letter = letter;
            this.frequency = frequency;
        }

        @Override
        public String toString() {
            return "Node{" + letter + ", " + frequency + '}';
        }
    }

    /**
     * Consumes input string and returns a string with top 30% alphabetic characters used in the given input string.
     * 1. Top 30% means that the sum of the most occurring alphabetic characters is not more than 30% of the total sum of all alphabetic character occurrences.
     * 2. The function should not consider the case of the alphabetic characters
     * 3. If input length <= 3, then the output should be empty string.
     * 4. If more than one character have the same number of occurrences, then the selection of character should be based on alphabetic order.
     * @param input - input string
     * @return string that contains the maximum occurring top 30% of the alphabetic characters used in the given input
     */
    public String getTopCharacters(String input) {
        if (input.length() <= 3) return "";

        String str = filterChars(input);
        Map<Character, BigDecimal> frequency = getFrequency(str.toCharArray());
        List<Node> list = getSortedNodes(frequency);

        StringBuilder sb = new StringBuilder();
        BigDecimal total = BigDecimal.ZERO;
        BigDecimal thirty = new BigDecimal(30);
        while (!list.isEmpty() && total.compareTo(thirty) <= 0) {
            Node node = list.remove(0);
            if (total.add(node.frequency).compareTo(thirty) <= 0) {
                sb.append(node.letter);
                total= total.add(node.frequency);
            }
            else break;
        }

        return sb.toString();
    }

    /**
     * Returns string of only lowercase letters
     * This method is faster than regular expression s = s.replaceAll("[^A-Za-z]", "").toLowerCase();
     */
    private String filterChars(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ('A' <= c && c <= 'Z')
                sb.append((char) (c + 32));
            if ('a' <= c && c <= 'z')
                sb.append(c);
        }
        return sb.toString();
    }

    /**
     * Returns frequency of chars in string in percents
     */
    private Map<Character, BigDecimal> getFrequency(char[] chars) {
        Map<Character, BigDecimal> fr = new HashMap<>();
        BigDecimal length = new BigDecimal(chars.length);
        BigDecimal hundred = new BigDecimal(100);
        for (char aChar : chars)
            fr.put(aChar, fr.getOrDefault(aChar, BigDecimal.ZERO).add(BigDecimal.ONE));
        fr.entrySet().forEach(e -> e.setValue((e.getValue().multiply(hundred)).divide(length, 2, RoundingMode.UP)));
        return fr;
    }


    /**
     * Sorts internal Node class by frequency and alphabetically(if frequency is the same)
     */
    private List<Node> getSortedNodes(Map<Character, BigDecimal> frequency) {
        List<Node> list = new ArrayList<>();
        frequency.forEach((key, value) -> list.add(new Node(key, value)));
        list.sort((n1, n2) -> {
            int result = n2.frequency.compareTo(n1.frequency);
            if (result != 0)
                return result;
            return n1.letter.compareTo(n2.letter);
        });
        return list;
    }
}
