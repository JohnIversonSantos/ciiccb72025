import java.util.Scanner;

public class Task8 {

    // Method with variable arguments
    public static int sumCumulative(int... numbers) {
        int totalSum = 0;

        // Enhanced for each loop
        for (int n : numbers) {
            int cumulative = n * (n + 1) / 2;
            System.out.println("Cumulative sum for " + n + ": " + cumulative);
            totalSum += cumulative;
        }

        return totalSum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter? ");
        int count = input.nextInt();

        int[] numbers = new int[count];

        // enhanced for loop
        int i = 0;
        for (int j : numbers) {
            System.out.print("Enter number #" + (i + 1) + ": ");
            numbers[i] = input.nextInt();
            i++;
        }

        int total = sumCumulative(numbers);
        System.out.println("Total sum of cumulative sums: " + total);

        input.close();
    }
}
