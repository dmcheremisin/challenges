package com.coding.challenges.codility.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;

public class Chain {

    public static void main(String[] args) {

    }

    public int solution(int... A) {

        var map = new HashMap<Integer, Integer>();
        int length = A.length;
        for (int i = 0; i < length; i++)
            map.put(i, A[i]);

        HashMap<Integer, Integer> sortedByValueMap = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, HashMap::new));

        Iterator<Integer> iterator = sortedByValueMap.keySet().iterator();
        while (iterator.hasNext()) {
            Integer first = iterator.next();
            if (first == 0 || first == length - 1)
                continue;
            Integer second = null;
            if (iterator.hasNext())
                second = iterator.next();
            else
                return 0;

            if (second == 0 || second == length - 1)
                continue;

            if (Math.abs(first - second) > 1)
                return map.get(first) + map.get(second);
        }

        return 0;
    }

}
