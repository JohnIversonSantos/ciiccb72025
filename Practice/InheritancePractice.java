package Practice;

class Book {
    String title;
    String author;
    int year;

    // The Book is a parent class and this constructor is required to use the super()
    // If this is missing, the compiler will look for no-arg constructor
    Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    void displayInfo() {
        System.out.println("Title: " + this.title + ", Author: " + this.author + ", Year: " + this.year);
    }
}

class Ebook extends Book {
    // Inherits the objects from the Book class
    double fileSize;

    Ebook(String title, String author, int year, double fileSize) {
        // the use of super to call the parent's (Book) constructor
        super(title, author, year);
        this.fileSize = fileSize;
    }

    @Override
    /* @Override
     * Indicates that a method declaration is intended to override a method 
     * declaration in a supertype. If a method is annotated with this annotation 
     * type compilers are required to generate an error message unless at least 
     * one of the following conditions hold:
     */
    void displayInfo() {
        super.displayInfo();
        System.out.println("File Size: " + this.fileSize + " MB");
    }
}

class PrintedBook extends Book {
    double weight;

    PrintedBook(String title, String author, int year, double weight) {
        super(title, author, year);
        this.weight = weight;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Weight: " + this.weight + " kg");
    }
}

public class InheritancePractice {
    public static void main(String[] args) {
        // ✅ Step 1: Create an array of Book (size 3 or 4)
        Book[] books = new Book[4];

        // ✅ Step 2: Store both Ebook and PrintedBook objects in it
        // Polymorphism Part
        books[0] = new Ebook("Digital Fortress", "Dan Brown", 1998, 1.5);
        books[1] = new PrintedBook("The Hobbit", "J.R.R. Tolkien", 1937, 0.5);
        books[2] = new Ebook("1984", "George Orwell", 1949, 2.0);
        books[3] = new PrintedBook("To Kill a Mockingbird", "Harper Lee", 1960, 0.4);

        // ✅ Step 3: Use a for loop to call displayInfo() on each element
        for(Book book : books) {
            book.displayInfo();
            System.out.println(); // Print a blank line between books for better readability
        }
    }
}
/**
 * The InheritancePractice class demonstrates the use of inheritance in Java.
 * It defines a base class Book and two derived classes Ebook and PrintedBook.
 * The main method creates an array of Book objects, including both Ebook and PrintedBook instances,
 * and calls the displayInfo() method on each to show their details.
 */

/*
 * Inheritance is a mechanism that allows one class (child / subclass) to reuse field
 * and methods of another class (parent / superclass).
 * Usage: Code Reusability
 * 
 * Polymorphism has an ability of a single interface to behave differently depending on
 * the actual object
 * Usage: Flexibility
 * 
 */