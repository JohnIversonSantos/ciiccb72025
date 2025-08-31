import java.util.Scanner;

public class ActivityString {
    public static void main(String[] args) {
        /*
         * Create a Program that takes a user input string nd performs the following operations:
         * 1. Find and print the length of the string.
         * 2. Convert the string to uppercase and print it.
         * 3. Convert he string to lowercase and print it.
         * 4. Print the first character of the string.
         * 5. Print the last character of the string.
         * 6. Print the substring starting from index 2 to index 5.
         */

         Scanner scanner = new Scanner(System.in);
            System.out.print("\nEnter a string: ");
            String input = scanner.nextLine();

            // 1. Length of the string
            System.out.println("Length of the String: " + input.length());
            // 2. Convert to uppercase
            System.out.println(input + " in Uppercase: " + input.toUpperCase());
            // 3. Convert to lowercase
            System.out.println(input + " in Lowercase: " + input.toLowerCase());
            // 4. First character
            System.out.println("First Character: " + input.charAt(0));
            // 5. Last character
            System.out.println("Last Character: " + input.charAt(input.length() - 1));
            // 6. Substring from index 2 to 5
            if (input.length() >= 6){
                System.out.println(input + "from index 2 to 5: " + input.substring(1, 5));
            }

            scanner.close();

    }
}
