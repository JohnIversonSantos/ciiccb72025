// package Activities;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string to check if it's a palindrome: ");
        String str = input.nextLine();

        String reversedStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }

        System.out.println(str + " = " + reversedStr);

        if(str.equalsIgnoreCase(reversedStr)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
