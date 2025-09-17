package ProgrammingChallenge;

import java.util.Scanner;

public class NumberChecker {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number");
        int num = input.nextInt();

        // Odd = Even Checker
        System.out.println(num + " is " + (num % 2 == 0 ? "Even" : "Odd"));
        // Positive - Negative Checker or Zero
        System.out.println(num == 0 ? "The number is Zero"
                                    : num > 0 ? num + " is Positive"
                                              : num + " is Negative");

        input.close();
    }
    
}
