package com.nice.java8.jsr_310;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println("now = " + now);
        System.out.println(now.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.JAPANESE));
        System.out.println(now.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH));
        System.out.println(now.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.JAPANESE));

        LocalDate localDate = now.withYear(1978);
        System.out.println(localDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH));

        LocalDate jeka = LocalDate.of(1978, 10, 3);
        LocalDate yonatan = LocalDate.of(1986, 8, 12);
        long between = ChronoUnit.DAYS.between(jeka, yonatan);
        System.out.println("between = " + between);


    }
}
