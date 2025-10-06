package ProgrammingChallenge;

import java.util.Scanner;

public class DisplayMultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.println("Multiplication Table: 10 x 10");
        int size = 10;

        for (int i = 1;i <= size; i++){
            for (int j = 1; j <= size; j++){
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }


        scanner.close();
    }
}
