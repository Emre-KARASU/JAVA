package day19passbyvaluedatetimeclasses;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class DateTime01 {

    public static void main(String[] args) {

        Date date1 = new Date();
        System.out.println(date1.getTime());//Returns the number of milliseconds since January 1, 1970 ==> 1646326922130

        //LocalDate
        System.out.println(LocalDate.now()); //2022-03-03  the current date using the system clock and default time-zone, not null
        System.out.println(LocalDate.now(ZoneId.of("Asia/Tokyo"))); //2022-03-04

        //How to get future dates
        System.out.println(LocalDate.now().plusDays(100)); //2022-06-11
        System.out.println(LocalDate.now().plusMonths(25));//2024-04-03

        //How to get past future
        System.out.println(LocalDate.now().minusDays(30)); //2022-02-01
        System.out.println(LocalDate.now().minusMonths(5).plusYears(2));//2023-10-03

        //Also you can use LocalTime
        System.out.println(LocalTime.now()); //20:15:08.940931800

        System.out.println(LocalTime.now().getHour());//20
        System.out.println(LocalTime.now().getMinute());//16

        System.out.println(LocalDate.now().getDayOfWeek());//THURSDAY
        System.out.println(LocalDate.now().getMonth());//MARCH
        System.out.println(LocalDate.now().getYear());//2022

        System.out.println(LocalTime.now().isAfter(LocalTime.of(22,12,35))); //false
        System.out.println(LocalTime.now().isBefore(LocalTime.of(22,12,35)));//true


    }
}
