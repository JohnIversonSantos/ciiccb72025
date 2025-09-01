public class StringBuilderSample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for (char current = 'a'; current <= 'z'; current++) {
            sb.append(current);
        }
        System.out.println(sb.toString());

        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b.append("f").append("g");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Important StringBuilder methods
        // chaAt, length, substring, indexOf, insert, delete, reverse, toString, append

        // Insert Method
        StringBuilder str = new StringBuilder("animals");
        str.insert(str.length(), "-");
        str.insert(0, "-");
        System.out.println(str); // -animals-

        // Delete Method
        b.delete(1,4);
        System.out.println(b); // aefg

        // Reverse Method
        str.reverse();
        System.out.println(str);

        // Convert to String
        String str2 = str.toString();
        System.out.println(str2);

        StringBuilder sBuilder = new StringBuilder("Hello");
        sBuilder.append(" World");
        System.out.println(sBuilder.toString()); // Outputs "Hello World"


        // Understanding Equality
        // Example 1: String
        StringBuilder one = new StringBuilder("");
        StringBuilder two = new StringBuilder("");
        StringBuilder three = one.append("a");
        System.out.println(one == two); // false
        System.out.println(one.equals(two)); // false  
        // because StringBuilder does not override equals()

        System.out.println(one == three); // true
        System.out.println(one.equals(three)); // true

        // Example 2: String
        String s1 = "Hello World";
        String s2 = "Hello World";
        System.out.println(s1 == s2); // true
        System.out.println(s1.equals(s2)); // true

        // Example 3:
        String x = "Hello World";
        String z = " Hello World".trim();
        System.out.println(x == z); // false
        System.out.println(x.equals(z)); // true
    }
}