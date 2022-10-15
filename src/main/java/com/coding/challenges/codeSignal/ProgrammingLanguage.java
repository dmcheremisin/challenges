package com.coding.challenges.codeSignal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//Suppose you are creating a new programming language. This language will support OOP, and to make it special, you want some features of it to differ from the standard.
//
//In some languages (such as C or Java), class constructor names are forced to have the same name as the class. Here you want to weaken this restriction, and to allow constructor names to be acceptable as long as they're close to the class name. We will consider two strings close if one can be obtained from the other, using the following operations:
//
//swap any two symbols in one of the strings,
//swap occurrences of any two existing symbols in one of the strings (for example, if your string contains both as and bs, you can change all as to bs and all the bs to as).
//Now you want to write a method that finds out whether the given methodName is considered close to the given className, by the definition above.
//
//Hint: One of the possible ways to solve the task might be the following. For both methodName and className build a map with the numbers of occurrences of each symbol. Then check whether the sets of the keys of both maps, containing symbols of the names, are equal. Since all occurrences of any two existing symbols can be freely swapped, you can, finally, check whether the multisets of the values of both maps are also equal.
//
//Example
//
//For className = "abbzccc" and methodName = "babzzcz", the output should be
//solution(className, methodName) = true.
//
//One possible way to transform "abbzccc" to "babzzcz" is this:
//
//"abbzccc" (this string is className)
//"babzccc" (swap positions of the first two characters)
//"babczzz" (switch all c and z characters)
//"babzzcz" (swap positions of the characters at indices 3 and 5; this string is now methodName)
//For className = "abcbdb" and methodName = "bbbcca", the output should be solution(className, methodName) = false.
//
//Since className contains the character "d" but methodName doesn't, it won't be possible to make these strings equal through any series of swaps.

//Input:
//className: "a"
//methodName: "b"
//Expected Output:
//false
//Input:
//className: "bbcd"
//methodName: "cbdb"
//Expected Output:
//true
public class ProgrammingLanguage {

    boolean solution(String className, String methodName) {
        if (className.length() != methodName.length() || className.length() == 1) {
            return false;
        }
        Map<Character, Integer> classNameOccurrences = getOccurencies(className);
        Map<Character, Integer> methodNameOcurrencies = getOccurencies(methodName);
        if (!classNameOccurrences.keySet().containsAll(methodNameOcurrencies.keySet())) {
            return false;
        }
        Collection<Integer> classVals = classNameOccurrences.values();
        Collection<Integer> methodVals = methodNameOcurrencies.values();
        Collection<Integer> classCopy = new ArrayList<>(classVals);
        if(classVals.size() != methodVals.size())
            return false;
        classCopy.removeAll(methodVals);
        methodVals.removeAll(classVals);

        return methodVals.size() == 0 && classCopy.size() == 0;
    }

    Map<Character, Integer> getOccurencies(String str) {
        Map<Character, Integer> occurencies = new HashMap<>();
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            occurencies.put(aChar, occurencies.getOrDefault(aChar, 0) + 1);
        }
        return occurencies;
    }
}
