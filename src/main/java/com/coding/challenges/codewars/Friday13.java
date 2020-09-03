package com.coding.challenges.codewars;

//Friday 13th or Black Friday is considered as unlucky day. Calculate how many unlucky days are in the given year.//Find the number of Friday 13th in the given year.
//Input: Year as an integer.
//Output: Number of Black Fridays in the year as an integer.
//Examples:
//unluckyDays(2015) == 3
//unluckyDays(1986) == 1

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

public class Friday13 {

    public static void main(String[] args) {
        System.out.println(unluckyDays(1986));
        System.out.println(unluckyDays(2015));
    }

    public static int unluckyDays(int year) {
        int countFriday13 = 0;
        for (Month month : Month.values()) {
            LocalDate date = LocalDate.of(year, month, 13);
            if (date.getDayOfWeek().equals(DayOfWeek.FRIDAY))
                countFriday13++;
        }
        return countFriday13;
    }

    public static int unluckyDaysStream(int year) {
        return (int) Arrays.stream(Month.values())
                .map(month -> LocalDate.of(year, month, 13))
                .filter(date -> date.getDayOfWeek().equals(DayOfWeek.FRIDAY))
                .count();
    }
}
