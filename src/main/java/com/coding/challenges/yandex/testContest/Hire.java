package com.coding.challenges.yandex.testContest;

import java.util.*;
import java.util.stream.IntStream;

//C. Найм
//Ограничение времени	1 секунда
//Ограничение памяти	256Mb
//Ввод	стандартный ввод или input.txt
//Вывод	стандартный вывод или output.txt
//Яндекс Банк расширяет команду разработки. HR попросила нашего разработчика Серёгу рассказать об этом своим друзьям,
// чтобы они рассказали своим, те – своим и так далее, пока про набор в Финтех не узнают вообще все. HR знает всех
// разработчиков (такая у них работа) и то, как быстро расходятся такие новости. Помоги ей понять, когда наступит
// «час икс» – когда не останется никого, кто ещё не в курсе.
//Формат ввода
//В первой строке 2 числа: N (1 <= N <= 100) — количество разработчиков, X (1 <= X <= N) — порядковый номер Серёги в
// записях HR. В следующей строчке M (1 <= M <= 6000) — количество связей между разработчиками. Дальше следуют M
// строк, описывающих эти связи. В каждой строке 3 числа: i (1 <= i <= N) — номер разработчика в записях HR, j (1 <=
// j <= N) — номер разработчика, которому расскажут о новости, k (1 <= k <= 100) — время в наносекундах, через
// которое i расскажет j о новости
//Формат вывода
//Одно число, время в наносекундах через которое все узнают о новости. Или -1 в случае если этого некогда не произойдет.
//Пример
//Ввод
//4 2
//3
//2 1 1
//2 3 1
//3 4 1
//Вывод
//2

public class Hire {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String[] s = scanner.nextLine().split(" ");
            int devs = Integer.parseInt(s[0].trim());
            int sourceIndex = Integer.parseInt(s[1].trim());
            int size = Integer.parseInt(scanner.nextLine().trim());

            Map<Integer, List<Integer[]>> adjList = new HashMap<>();
            int[] times = new int[devs];
            IntStream.range(0, devs).forEach(i -> {
                adjList.put(i, new ArrayList<>());
                times[i] = Integer.MAX_VALUE;
            });

            while (scanner.hasNextLine()) {
                String[] line = scanner.nextLine().split(" ");
                int source = Integer.parseInt(line[0].trim());
                int dest = Integer.parseInt(line[1].trim());
                int time = Integer.parseInt(line[2].trim());
                adjList.computeIfAbsent(source - 1, k -> new ArrayList<>()).add(new Integer[]{dest - 1, time});
            }

            PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(i -> times[i]));
            queue.add(sourceIndex - 1);
            times[sourceIndex - 1] = 0;

            while (!queue.isEmpty()) {
                Integer current = queue.poll();
                List<Integer[]> edges = adjList.get(current);
                for (Integer[] edge : edges) {
                    int target = edge[0];
                    int weight = edge[1];
                    if (times[target] > times[current] + weight) {
                        times[target] = times[current] + weight;
                        queue.add(target);
                    }
                }
            }
            int max = Arrays.stream(times).max().getAsInt();
            System.out.println(max == Integer.MAX_VALUE ? -1 : max);
        }
    }

}
