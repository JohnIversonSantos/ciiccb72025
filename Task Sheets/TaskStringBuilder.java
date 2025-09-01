import java.util.Scanner;

public class TaskStringBuilder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string to check if it's a palindrome: ");
        String str = input.nextLine();

        // Use StringBuilder to reverse the string
        StringBuilder sb = new StringBuilder(str);
        String reversedStr = sb.reverse().toString();

        System.out.println(str + " = " + reversedStr);

        if (str.equalsIgnoreCase(reversedStr)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

        input.close();
    }
}
