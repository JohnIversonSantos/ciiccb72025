import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        // White a program that takes three numbers from the user
        // and determines the largest of the three numbers.
        // If the numbers are equal, it should print "All numbers are equal".
        Scanner input = new Scanner(System.in);

        int num[] = new int[3];
        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            num[i] = input.nextInt();
        }
        Arrays.sort(num);
        System.out.println((num[0] == num[1]) ? "All numbers are equal" : "Largest number is: " + num[2]);

        input.close();
    }
}
