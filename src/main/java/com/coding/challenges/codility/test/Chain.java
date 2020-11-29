package com.coding.challenges.codility.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Chain {

    public static void main(String[] args) {
        System.out.println(new Chain().solution(1, 4, 78, 2, 15, 3, 56, 22));
    }

    public int solution(int... A) {
        var map = new HashMap<Integer, Integer>();
        int length = A.length;
        for (int i = 1; i < length - 1; i++)
            map.put(i, A[i]);

        LinkedHashMap<Integer, Integer> sortedByValueMap = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        Iterator<Integer> iterator = sortedByValueMap.keySet().iterator();
        Integer first = iterator.next();
        while (iterator.hasNext()) {
            Integer second = iterator.next();
            if (Math.abs(first - second) > 1)
                return map.get(first) + map.get(second);
        }
        return 0;
    }

}
