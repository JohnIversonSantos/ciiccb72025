public class Task9 {

    /*
     * MATH OPERATIONS WITH STATIC IMPORT
     * Create a java program that performs basic math operations
     * (addition, subtraction, multiplication, division) using
     * static imports for the Math class methods. The program should have
     * following features.
     * > Define a class named Task9
     * > Inside the class, create a static method for addition, subtraction,
     * multiplication, division.
     * > Each method should take two parameters and return the result
     * > Imports the Math Class Method
     */

    public static int add(int a, int b){
        System.out.println(Math.addExact(a, b));
        return 0;
    }
    public static int subtract(int a, int b){
        System.out.println(Math.subtractExact(a, b));
        return 0;
    }
    public static int multiply(int a, int b){
        System.out.println(Math.multiplyExact(a, b));
        return 0;
    }
    public static float divide(int a, int b){
        System.out.println(Math.floorDiv(a, b));
        return 0;
    }

    public static void main(String[] args) {
        add(10, 20);
        subtract(10, 20);
        multiply(10, 20);
        divide(40, 5);
    }
    
}
