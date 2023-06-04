package com.coding.challenges.yandex.testContest;

import java.util.LinkedList;
import java.util.Scanner;

//A. Cамокаты
//Ограничение времени	1 секунда
//Ограничение памяти	256Mb
//Ввод	стандартный ввод или input.txt
//Вывод	стандартный вывод или output.txt
//Наш пользователь Федя обожает самокаты и мосты, и неплохо совмещает одно с другим. В этом году он решил отправиться
// в самое долгое двухколёсное путешествие к самому длинному вантовому мосту в мире — на остров Русский. Оплатить
// поездку «Москва – Владивосток – Москва» он, конечно, решил Картой Плюса. Но сумма вышла настолько космической, что
// сломался код.
//Помоги нашему сеньору Боре посчитать, какой минимум должен лежать у Феди на счету, чтобы он, как Фродо, смог
// доехать туда и обратно.
//Число представлено в виде массива - внутри квадратных скобок все цифры этого числа, перечисленные через запятую.
// Например, 12 (двенадцать) - это строка "[1, 2]".
//
//Формат ввода
//Две строки, каждая из которых представляет собой число.
//Формат вывода
//Одна строка, представляющая собой число.
//Пример
//Ввод
//[1, 2]
//[2, 5]
// Вывод
//[3, 7]

public class Scooter {

    public static void main(String[] args) {
        int result = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            while(scanner.hasNext()) {
                String line = scanner.nextLine();
                line = line.replace("[", "").replace("]", "");
                String[] split = line.split(",");
                int current = 0;
                int length = split.length;
                for (int i = 0; i < length; i++) {
                    int value = Integer.parseInt(split[i].trim());
                    current += value * Math.pow(10, length - i - 1);
                }
                result += current;
            }
        }
        LinkedList<Integer> out = new LinkedList<>();
        while (result > 0) {
            int cur = result % 10;
            out.addFirst(cur);
            result = result / 10;
        }
        System.out.print(out);
    }
}