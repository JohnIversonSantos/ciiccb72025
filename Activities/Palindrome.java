import java.util.Scanner;

public class Palindrome {

        /*
        * White a program that takes a string input from the user and determines if it is a palindrome or not using only String methods.
        * 
        * A palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward (ignoring spaces, punctuation, and capitalization).]
        * 
        * Your program should output "Palindrome" if the input string is a palindrome, and "Not a palindrome" otherwise.
        */

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

        input.close();
    }
}
