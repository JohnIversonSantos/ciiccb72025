public class Task2{
    public static void main(String[] args) {
        // Create all of the primitives (except long and double) with
        // different values. Concatenate them into a single string
        // and print to the screen so it will print
        // H3110 w0rld 2.0 true

        // Primitive data types:
        // byte, short, int, char, float, boolean

        byte b = 0;
        short s = 1;
        int i = 3;
        float f = 2.0f;
        char c1 = 'H';
        char c2 = 'w';
        boolean bool = true;
        String str = "rld ";

        String output = " " + c1 + i + s + s + b + " " + c2 + b + str + f + " " + bool;
        System.out.println(output);
        
    }
}