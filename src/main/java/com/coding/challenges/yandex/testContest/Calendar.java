package com.coding.challenges.yandex.testContest;

import java.time.LocalTime;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

//B. Календари
//Ограничение времени	1 секунда
//Ограничение памяти	256Mb
//Ввод	стандартный ввод или input.txt
//Вывод	стандартный вывод или output.txt
//Ура, наш старший разработчик Борщ (aka Боря) решил задачу с Фединым бюджетом, и теперь ему дали команду! Помимо
// тебя в этой команде ещё N человек и со всеми надо познакомиться: пригласить на встречу и рассказать о себе. Но у
// ребят цейтнот в календаре, а твой рабочий день не резиновый — с A до B.
//Найди максимально возможный отрезок времени для встречи на завтра — с точностью до минут. А если общий митинг
// поставить нельзя, выведи "ALARM"
//
//Формат ввода
//На первой строке два целых числа - N (0 <= N <= 10̂5) и M (0 <= M <= 10̂5)- количество участников команды и общее
// количество встреч На следующей - твое расписание, в формате HH:MM-HH:MM На следующих M строках - описания встреч,
// в формате X HH:MM-HH:MM, где X - номер участника команды
//Формат вывода
//Описание возможной встречи в формате HH:MM-HH:MM или строка "ALARM"
//Пример 1
//Ввод
//1 1
//12:00-20:00
//1 12:00-12:30
//Вывод
//12:30-20:00
//Пример 2
//Ввод
//1 1
//12:00-20:00
//1 12:00-20:00
//Вывод
//ALARM

public class Calendar {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String[] s = scanner.nextLine().split(" ");
            int teamNum = Integer.parseInt(s[0].trim());
            int meetings = Integer.parseInt(s[1].trim());
            String[] timetable = scanner.nextLine().split("-");
            LocalTime start = LocalTime.parse(timetable[0].trim());
            LocalTime end = LocalTime.parse(timetable[1].trim());
            if(!scanner.hasNextLine()) {
                System.out.println(start + "-" + end);
                return;
            }

            TreeMap<LocalTime, LocalTime> slots = new TreeMap<>();
            while (scanner.hasNextLine()) {
                String nextLine = scanner.nextLine();
                String[] slot = nextLine.split(" ")[1].split("-");
                LocalTime slotStart = LocalTime.parse(slot[0].trim());
                LocalTime slotEnd = LocalTime.parse(slot[1].trim());
                slots.put(slotStart, slotEnd);
            }
            TreeMap<LocalTime, LocalTime> processedSlots = new TreeMap<>();
            Map.Entry<LocalTime, LocalTime> prevEntry = null;
            for (Map.Entry<LocalTime, LocalTime> entry : slots.entrySet()) {
                if (prevEntry == null) {
                    prevEntry = entry;
                    processedSlots.put(prevEntry.getKey(), prevEntry.getValue());
                    continue;
                }
                if (prevEntry.getValue().equals(entry.getKey())) {
                    prevEntry.setValue(entry.getValue());
                } else {
                    prevEntry = entry;
                }
                processedSlots.put(prevEntry.getKey(), prevEntry.getValue());
            }
            LocalTime availableStart = start;
            LocalTime maxSlotStart = null;
            LocalTime maxSlotEnd = null;
            int maxDiff = 0;
            for (Map.Entry<LocalTime, LocalTime> entry : processedSlots.entrySet()) {
                LocalTime slotStart = entry.getKey();
                LocalTime slotEnd = entry.getValue();
                int diff = availableStart.toSecondOfDay() - slotStart.toSecondOfDay();
                if (diff > 0 && diff > maxDiff) {
                    maxDiff = diff;
                    maxSlotStart = availableStart;
                    maxSlotEnd = slotStart;
                }
                availableStart = slotEnd;
            }
            Map.Entry<LocalTime, LocalTime> last = processedSlots.lastEntry();
            if (end.toSecondOfDay() - last.getValue().toSecondOfDay() > maxDiff) {
                maxDiff = end.toSecondOfDay() - last.getValue().toSecondOfDay();
                maxSlotStart = last.getValue();
                maxSlotEnd = end;
            }

            if (maxDiff == 0) {
                System.out.println("ALARM");
            } else {
                System.out.println(maxSlotStart + "-" + maxSlotEnd);
            }
        }
    }
}

//1 1
//12:00-20:00
//1 12:00-12:30
//2 12:30-14:00

//1 1
//12:00-20:00
//1 12:00-12:30