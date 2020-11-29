package com.coding.challenges.codility.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueString {

    public static void main(String[] args) {
        System.out.println(solution("example"));
    }

    public static int solution(String S) {
        if (S == null || S.isBlank() || S.length() == 1)
            return 0;

        Map<String, Long> charsByCount = S.chars()
                .mapToObj(c -> c + "")
                .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));

        var reversedMap = new HashMap<>();

        int charsToDelete = 0;
        for (String key : charsByCount.keySet()) {
            Long count = charsByCount.get(key);

            int howMuchToReduce = 0;
            for (; howMuchToReduce < count; howMuchToReduce++) {
                Long newCount = count - howMuchToReduce;
                if (!reversedMap.containsKey(newCount)) {
                    reversedMap.put(newCount, key);
                    break;
                }
            }
            charsToDelete += howMuchToReduce;
        }

        return charsToDelete;
    }

}
