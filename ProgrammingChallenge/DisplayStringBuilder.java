package ProgrammingChallenge;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DisplayStringBuilder {
    

    public static void main(String[] args) {
        // Create Scanner
        Scanner scanner = new Scanner(System.in);

        // Create a StringBuilder for Input
        StringBuilder sb = new StringBuilder();

        // Read UserInput
        System.out.print("Enter a Word: ");
        String input = scanner.nextLine();

        // Append input to StringBuilder
        sb.append(input);

        System.out.println(sb.toString());

        // 1. Print the length of the string
        System.out.println("Length: "+ sb.length());

        // 2. Print the first character of the string
        System.out.println("First Character: " + sb.charAt(0));
        
        // 3. Print the last character of the string
        System.out.println("Last Character: " + sb.charAt(sb.length()-1));

        // 4. Print the index of the first occurrence of the letter 'a' in the string
        int index = IntStream.range(0, sb.length())                  // Stream of indeces 0 to sb.length - 1
                    .filter(i -> Character.toLowerCase(sb.charAt(i)) == 'a')        // keep only indeces where char == 'a'
                    .findFirst()                                                    // get the first match
                    .orElse(-1);                                                    // if found none, return -1

                System.out.println("Index of First 'a': " + index);

        // 5. Print the substring of the string from index 3 to index 6
        String sub = IntStream.range(3, Math.min(6, sb.length()))  // stops before exceeding length
                .filter(i -> i >= 0 && i < sb.length())                             // extra safety
                .mapToObj(i -> String.valueOf(sb.charAt(i)))                        // convert each char to String
                .collect(Collectors.joining());                                     // join all chars together

        System.out.println("Substring index 3 to 6: " + sub);

        // 6. Append the string "123" to the end of the string
        System.out.println("Input + 123: " + sb.append("123"));

        // 7. Insert the string "xyz" at index 4
        System.out.println("Insert xyz" + sb.insert(4, "xyz"));

        // 8. Delete the substring from index 2 to index 4
        String result = IntStream.range(0, sb.length())
                .filter(i -> i <= 2 || i >= 4) // skip 2 and 3
                .mapToObj(i -> String.valueOf(sb.charAt(i)))
                .collect(Collectors.joining());

        System.out.println("After Deleting Index 2 to 4: " + result);

        // Uising Delete
        // System.out.println(sb.delete(2, 4));

        // 9. Delete the character at index 8
        String result2 = IntStream.range(0, sb.length())       // iterate through all indices
                .filter(i -> i != 8)                                          // skip the index we want to remove
                .mapToObj(i -> String.valueOf(sb.charAt(i)))                  // convert chars to string
                .collect(Collectors.joining());                               // join into a single string

        System.out.println("After Deleting Index 8: " + result2);

        // Using CharAt
        // System.out.println("Using ChatAt: " + sb.deleteCharAt(8));

        // 10. Reverse the string and print it
        System.out.println(sb.append(index) + " in reverse is " + sb.reverse());

        scanner.close();
    }
}
