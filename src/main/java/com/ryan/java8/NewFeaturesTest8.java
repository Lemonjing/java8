package com.ryan.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 * Date/Time API
 */
public class NewFeaturesTest8 {
    public static void main(String args[]){
        NewFeaturesTest8 tester = new NewFeaturesTest8();
        tester.testLocalDateTime();
    }

    public void testLocalDateTime(){

        // 获得当前的日期和时间
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("current date and time: " + currentDateTime);

        // 输出当前日期的本地值（本时区）
        LocalDate date1 = currentDateTime.toLocalDate();
        System.out.println("local date: " + date1);

        // 输出当前时间的本地值（本时区）
        LocalTime time1 = currentDateTime.toLocalTime();
        System.out.println("local time: " + time1);

        Month month = currentDateTime.getMonth();
        int day = currentDateTime.getDayOfMonth();
        int seconds = currentDateTime.getSecond();

        // 由当前时间对象获得各个字段，输出结果
        System.out.println("month: " + month +"day: " + day +"seconds: " + seconds);

        // 由当前时间附带月份和年再输出
        LocalDateTime date2 = currentDateTime.withDayOfMonth(10).withYear(2012);
        System.out.println("date 2: " + date2);

        // 在 Java 8 中获取特定日期
        LocalDate date3 = LocalDate.of(2016, Month.DECEMBER, 25);
        System.out.println("date 3: " + date3);

        // 在 Java 8 中获取特定时间
        LocalTime date4 = LocalTime.of(19, 00);
        System.out.println("date 4: " + date4);

        // 转化为字符串，再输出
        LocalTime date5 = LocalTime.parse("20:15:30");
        System.out.println("date 5: " + date5);

        String a = "A";
        String  b = "A";
        System.out.println(a == b);
    }
}
