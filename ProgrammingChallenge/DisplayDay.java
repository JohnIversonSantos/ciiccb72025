package ProgrammingChallenge;

import java.time.DayOfWeek;
import java.util.Scanner;

public class DisplayDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Day Number [1 - 7]: ");
        int day = input.nextInt();

        if (day < 1 || day > 7){
            System.out.println("Invalid Day Number");
        } else {
            DayOfWeek dow = DayOfWeek.of(day);

            String dayName = dow.toString().substring(0, 1).toUpperCase()
                            + dow.toString().substring(1).toLowerCase();

            System.out.println("Day " + day + " is: " + dayName);
        }

        input.close();
    }
}
