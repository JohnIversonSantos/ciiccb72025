package ProgrammingChallenge;

import java.util.Scanner;

public class DisplayStringMethods {
    
    // Find and print the length of the string
    // Convert the string to uppercase and print it.
    // Convert the string to lowercase and print it.
    // Print the first character of the string.
    // Print the last character of the string.
    // Print the substring starting from the second character to the fifth character of the string.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println("Length of the String: " + input.length());
        System.out.println(input.toUpperCase() + " in UpperCase");
        System.out.println(input.toLowerCase() + " in Lowercase");
        System.out.println("The first character of " + input + " is " + input.charAt(0));
        System.out.println("The last character of " + input + " is " + input.charAt(input.length()-1));
        if (input.length() >= 6){
                System.out.println(input + " from index 2 to 5: " + input.substring(1, 5));
            }

        scanner.close();
    }
}
