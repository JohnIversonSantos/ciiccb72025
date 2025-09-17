package ProgrammingChallenge;

import java.time.Month;
import java.time.YearMonth;
import java.util.Scanner;

public class DisplayMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a month number (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month number!");
        } else {

            Month m = Month.of(month);

            YearMonth ym = YearMonth.of(year, month);

            System.out.println("The month is: " + m + " and it has " + ym.lengthOfMonth() + " days.");
        }

        input.close();
    }
}
