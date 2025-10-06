package ProgrammingChallenge;

import java.util.Scanner;

public class CountNumberOfWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Trim spaces and split words by one or more spaces
        String[] words = sentence.trim().split("\\s+");

        // Handle empty input
        int wordCount = (sentence.trim().isEmpty()) ? 0 : words.length;

        System.out.println("Number of words: " + wordCount);

        scanner.close();
    }
}
