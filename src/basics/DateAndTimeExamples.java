package basics;

import java.time.*;

public class DateAndTimeExamples {
    public static void main(String[] args) {

        //LocalTime
        LocalTime localTime = LocalTime.now();
        System.out.println("Now is " + localTime);
        // get rid of milliseconds - put "0" after withNano - the it will show none of milliseconds
        LocalTime localTimeSec = LocalTime.now().withNano(0);
        System.out.println("Now is " + localTimeSec);
        System.out.println(localTimeSec.getHour() + "/" + localTimeSec.getMinute() + "/" + localTimeSec.getSecond());

        // For example, if we want to set exact time for break
        LocalTime localTime1 = LocalTime.now().withNano(0);
        localTime1 = localTime1.plusMinutes(15);
        System.out.println("Break until " + localTime1);

        System.out.println("Now is " + localTime.getHour() + " full hours");

        //Local Date

        LocalDate localDate = LocalDate.now();
        System.out.println("Today is: " + localDate);
        System.out.println("Year is: " + localDate.getYear());
        System.out.println("Day of the week: " + localDate.getDayOfWeek());
        System.out.println("Day of the year: " + localDate.getDayOfYear());

        LocalDate startOfCovid = LocalDate.of(2019, Month.DECEMBER, 11);
        System.out.println("Covid started on: " + startOfCovid);

        //LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.now().withNano(0);
        System.out.println("Date and time now: " + localDateTime);

        LocalDateTime firstInternationalCatsDay = LocalDateTime.of(2002, 8, 8, 10,45,40,0);
        System.out.println("International cat's day was started on: " + firstInternationalCatsDay);

        //Duration
        System.out.println(Duration.ofHours(10).toMinutes());
        System.out.println(Duration.between(LocalDateTime.now(), LocalDateTime.now().plusDays(2)).toMinutes());

        // Period
        System.out.println(Period.between(startOfCovid, LocalDate.now()).toTotalMonths());









    }
}
