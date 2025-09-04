import java.util.Scanner;

public class Task4_StringBuilder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string to check if it's a palindrome: ");
        String str = input.nextLine();

        // Use StringBuilder to reverse the string
        StringBuilder sb = new StringBuilder(str);
        String reversedStr = sb.reverse().toString();

        System.out.println(str + " = " + reversedStr);

        System.out.println(str.equalsIgnoreCase(reversedStr) ? "Palindrome" : "Not a palindrome");

        input.close();
    }
}
