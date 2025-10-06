package ProgrammingChallenge;

import java.util.Scanner;

public class DisplayPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Generate pattern
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // move to next line
        }

        scanner.close();
    }
}
