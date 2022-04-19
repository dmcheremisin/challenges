package com.coding.challenges.hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Container {

    public static void main(String[] args) {
        maximumContainers(Arrays.asList("10 2 5", "12 4 4", "6 2 2"));
    }

    public static void maximumContainers(List<String> scenarios) {
        for(String scenario: scenarios) {
            List<Integer> params = Arrays.asList(scenario.split(" ")).stream()
                    .map(s -> Integer.parseInt(s))
                    .collect(Collectors.toList());
            calculateContainers(params);
        }
    }

    private static void calculateContainers(List<Integer> params) {
        int budget = params.get(0);
        int price = params.get(1);
        int returnNum = params.get(2);
        int result = getResult(budget, price, returnNum, 0);
        System.out.println(result);
    }

    private static int getResult(int budget, int price, int returnNum, int quantity) {
        System.out.println(budget + " " + quantity);
        if (budget / price == 0)
            return quantity;
        int containersNum = budget / price;
        quantity += containersNum;
        budget -= (price * containersNum);
        budget += ((quantity/returnNum) * price);
        return getResult(budget, price, returnNum, quantity);
    }
}
