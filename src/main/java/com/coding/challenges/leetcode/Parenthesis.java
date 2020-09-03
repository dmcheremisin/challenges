package com.coding.challenges.leetcode;

//Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
//For example, given n = 3, a solution set is:
//[
//  "((()))",
//  "(()())",
//  "(())()",
//  "()(())",
//  "()()()"
//]
//
//n=1
// 0
//"()"
//------------------
//0
//===============
//n=2
// 01
//"(())"
// 0 2
//"()()"
//------------------
//01, 02
//===============
//n=3
// 012
//"((()))",
// 01 3
//"(()())",
// 01  4
//"(())()",
// 0 23
//"()(())",
// 0 2 4
//"()()()"
//------------------
//012, 013, 014, 023, 024
// 2 = n - 1 (elements available for storage)
// 2(border index, no more combinations on it) =
//      2n - 2(last index) - (n - 1)(elements to store in string, first always 0) = n - 1

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Parenthesis {

    public static void main(String[] args) {
        List<String> strings = new Parenthesis().generateParenthesis(4);
        strings.forEach(System.out::println);
    }

    public List<String> generateParenthesis(int n) {
        int lastIndex = 2 * n - 1;

        Set<Set<Integer>> setOfSets = new HashSet<>();
        getIntegers(0, 0, n, lastIndex, new HashSet<>(), setOfSets);

        return convertSetsOfIntsToStrings(lastIndex, setOfSets);
    }

    private List<String> convertSetsOfIntsToStrings(int lastIndex, Set<Set<Integer>> setOfSets) {
        List<String> listOfStrings = new ArrayList<>();
        for (Set<Integer> setOfInts : setOfSets) {
            StringBuilder parenthesis = new StringBuilder();
            for (int i = 0; i <= lastIndex; i++) {
                parenthesis.append(setOfInts.contains(i) ? "(" : ")");
            }
            listOfStrings.add(parenthesis.toString());
        }
        return listOfStrings;
    }

    private void getIntegers(int itemNumber, int position, int n, int lastIndex, Set<Integer> set,
                             Set<Set<Integer>> setOfSets) {
        if (itemNumber >= n) {
            setOfSets.add(set);
            return;
        }
        int borderIndex = lastIndex - 2 * (n - itemNumber) + 1;

        for (int i = position; i <= borderIndex; i++) {
            Set<Integer> newSet = new HashSet<>(set);
            newSet.add(i);
            getIntegers(itemNumber + 1, i + 1, n, lastIndex, newSet, setOfSets);
        }
    }
}
