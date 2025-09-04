package ProgrammingChallenge;

import java.util.Scanner;

public class DisplayMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a month number (1-12): ");

        int month = input.nextInt();
        String monthName;
        int monthDays = 0;
        switch (month) {
            case 1:
                monthName = "January";
                monthDays = 31;
                break;
            case 2:
                monthName = "February";
                monthDays = 28;
                break;
            case 3:
                monthName = "March";
                monthDays = 31;
                break;
            case 4:
                monthName = "April";
                monthDays = 30;
                break;
            case 5:
                monthName = "May";
                monthDays = 31;
                break;
            case 6:
                monthName = "June";
                monthDays = 30;
                break;
            case 7:
                monthName = "July";
                monthDays = 31;
                break;
            case 8:
                monthName = "August";
                monthDays = 31;
                break;
            case 9:
                monthName = "September";
                monthDays = 30;
                break;
            case 10:
                monthName = "October";
                monthDays = 31;
                break;
            case 11:
                monthName = "November";
                monthDays = 30;
                break;
            case 12:
                monthName = "December";
                monthDays = 31;
                break;
            default:
                monthName = "Invalid month number!";
        }

        System.out.println("The month is: " + monthName + " and it has " + String.valueOf(monthDays) + " days.");
    }
}
