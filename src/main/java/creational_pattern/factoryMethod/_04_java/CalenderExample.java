package creational_pattern.factoryMethod._04_java;

import java.util.Calendar;
import java.util.Locale;

public class CalenderExample {
    public static void main(String[] args) {
        System.out.println(Calendar.getInstance().getClass());
        System.out.println(Calendar.getInstance(Locale.forLanguageTag("th-TH-x-lvariant-TH")).getClass());
        System.out.println(Calendar.getInstance(Locale.forLanguageTag("ja-JP-x-lvariant-JP")).getClass());
    }
}

/**
 * [output]
 * ------------------------------------------------------
 * class java.util.GregorianCalendar
 * class sun.util.BuddhistCalendar
 * class java.util.JapaneseImperialCalendar
 * ------------------------------------------------------
 */