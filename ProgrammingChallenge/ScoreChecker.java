package ProgrammingChallenge;

import java.util.Scanner;

public class ScoreChecker {
    
    public static void main(String[] args) {
        // Write a program that takes in the score of a student in a test
        // and outputs their grade based on the following criteria:
        // 90-100: A
        // 80-89: B
        // 70-79: C
        // 60-69: D
        // Below 60: F

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the score of the student: ");
        int score = input.nextInt();

        char grade = score >= 90 ? 'A' :
                     score >= 80 ? 'B' :
                     score >= 70 ? 'C' :
                     score >= 60 ? 'D' : 'F';

        System.out.println("The grade is: " + grade);
        input.close();
    }
}
