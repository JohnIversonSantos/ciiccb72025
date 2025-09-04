import java.time.*;

public class DateTimeSample {
    public static void main(String[] args) {
        // Working with Dates and Times in Java

        // LocalDate: contains date - no time and no timezone
        System.out.println(LocalDate.now());

        // LocalTime: contains a time - no date and no timezone
        System.out.println(LocalTime.now());

        // LocalDateTime: contains both date and time - no timezone
        System.out.println(LocalDateTime.now());

        // ZonedDateTime: contains date, time, and timezone
        System.out.println(ZonedDateTime.now());

        // ZoneId: represents a timezone
        System.out.println(ZoneId.systemDefault());

        // Method now() returns the current date and time in the system's default timezone
        System.out.println("Current date and time: " + ZonedDateTime.now());

        // create a just a date with no time
        LocalDate date1 = LocalDate.of(2001, 8, 11);
        LocalDate date2 = LocalDate.of(2004, Month.JUNE, 23);

        // Local Time
        LocalTime time1 = LocalTime.of(6,15);
        LocalTime time2 = LocalTime.of(6,15, 59);
        LocalTime time3 = LocalTime.of(14,30, 59);

        // LocalDateTime
        LocalDateTime dateTime1 = LocalDateTime.of(2001, 8, 11, 6, 15);
        LocalDateTime dateTime2 = LocalDateTime.of(2004, Month.JUNE, 23, 14, 30, 59);
        LocalDateTime dateTime3 = LocalDateTime.of(date1, time1);
        LocalDateTime dateTime4 = LocalDateTime.of(date2, time3);

        // public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second, int nanoOfSecond);


        // ZonedDateTime
        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(dateTime1, ZoneId.of("America/New_York"));
        ZonedDateTime zonedDateTime2 = ZonedDateTime.of(dateTime2, ZoneId.of("Europe/London"));

        // Date Plus or Minus - Years, Months, Weeks, Days

        System.out.println(date1.plusDays(40).minusWeeks(0).minusMonths(3));

        System.out.println(time1.plusHours(1).minusNanos(300));
        System.out.println(time1);

        // Local Date Time: Plus or Minus
        
        System.out.println(dateTime1);
    }
}