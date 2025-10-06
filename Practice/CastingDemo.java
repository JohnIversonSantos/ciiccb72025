package Practice;
// CastingDemo.java
class Book {
    String title;
    String author;
    int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println(this.title + " by " + this.author + " (" + this.year + ")");
    }
}

class Ebook extends Book {
    double fileSize;

    public Ebook(String title, String author, int year, double fileSize) {
        super(title, author, year);
        this.fileSize = fileSize;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("File size: " + this.fileSize + " MB");
    }

    public void download() {
        System.out.println("Downloading " + this.title + "...");
    }
}

class PrintedBook extends Book {
    double weight;

    public PrintedBook(String title, String author, int year, double weight) {
        super(title, author, year);
        this.weight = weight;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Weight: " + this.weight + " kg");
    }

    public void putOnShelf() {
        System.out.println("Placing " + this.title + " on the shelf.");
    }
}

public class CastingDemo {
    public static void main(String[] args) {

        // ✅ Upcasting (safe, automatic)
        Ebook ebook = new Ebook("Inferno", "Dan Brown", 2013, 2.5);
        Book b1 = ebook; // upcast
        b1.displayInfo(); // Works, but only Book methods visible

        /*
         * 
         */

        System.out.println("------");

        // ✅ Downcasting (explicit, risky)
        Book b2 = new Ebook("Digital Fortress", "Dan Brown", 1998, 1.2);
        Ebook e2 = (Ebook) b2; // downcast back to Ebook
        e2.displayInfo();
        e2.download(); // now Ebook method is accessible

        System.out.println("------");

        // ❌ Wrong Downcasting (causes runtime error)
        Book b3 = new PrintedBook("The Hobbit", "J.R.R. Tolkien", 1937, 0.8);
        // Ebook e3 = (Ebook) b3; // UNCOMMENT → ClassCastException
        b3.displayInfo();

        System.out.println("Done.");
    }
}
