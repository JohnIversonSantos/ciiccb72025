package ProgrammingChallenge;

import java.util.Scanner;

public class SumInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int sum=0, n;

        while((n = input.nextInt())!= 0) sum += n;
        System.out.println(sum);

        input.close();
    }
}

