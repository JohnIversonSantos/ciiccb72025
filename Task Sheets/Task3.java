public class Task3 {
    public static void main(String[] args) {
        
        String a = new String("Wow").intern();
        String b = "Wow";
        String c = "Not Wow";
        String d = b + "!";

        boolean b1 = a == b;
        boolean b2 = d.equals(b + "!");
        boolean b3 = !c.equals(a);

        System.out.println("a == b: " + b1);
        System.out.println("d.equals(b + '!'): " + b2);
        System.out.println("!c.equals(a): " + b3);

        if (b1 && b2 && b3) {
            System.out.println("Success");
        } else {
            System.out.println("Not Success.");
        }
    }
}