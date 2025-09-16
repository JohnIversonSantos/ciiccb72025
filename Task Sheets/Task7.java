import java.util.Scanner;

public class Task7 {

    public static double getSum (double a, double b){
        return a + b;
    }

    public static double getDifference (double a, double b){
        return a - b;
    } 
    
    public static double getProduct (double a, double b){
        return a * b;
    }
    
    public static double getQuotient (double a, double b){

        if (a == 0 && b == 0){
            System.out.println("Error: Division by Zero!");
            return 0;
        }
        return a / b;
    }
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double firstNum = input.nextDouble();

        System.out.print("Enter second number: ");
        double secondNum = input.nextDouble();

        // Call methods and print results
        System.out.println("Sum: " + getSum(firstNum, secondNum));
        System.out.println("Difference: " + getDifference(firstNum, secondNum));
        System.out.println("Product: " + getProduct(firstNum, secondNum));
        System.out.println("Quotient: " + getQuotient(firstNum, secondNum));

        input.close();
    }
}