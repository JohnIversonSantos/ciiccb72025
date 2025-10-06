package ProgrammingChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class CheckVowelsConsonant {
    

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        final String VOWELS[] = {"a", "e", "i", "o", "u"};

        System.out.print("Enter a word: ");
        String word = scanner.nextLine().toLowerCase();

        int vowels = 0, consonants = 0;

        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                String letter = String.valueOf(ch);

                if(Arrays.asList(VOWELS).contains(letter)){
                    vowels++;
                } else{
                    consonants++;
                }
            }
        }

        System.out.println("Number of Vowels: " + vowels);
        System.out.println("Number of Consonants: " + consonants);

        scanner.close();
    }
}
