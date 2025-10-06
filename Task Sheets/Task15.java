/*
 * 1. Define an interface called Shape with the following methods:
 *      calculateArea(): double (Math.PI * radius * radius; )
 *      calculatePerimeter(): double (2* Math.PI * radius; )
 * 
 * 2. Create an Abstract Class called AbstractShape that implements the Shape Interface
 * This class should have:
 *      Instance Variables to represent common attributes of shapes
 * 
 *      String color, double length, double width
 *          A constructor to initialize these attributes.
 *          Implementations for the calculateArea and calculatePerimeter methods.
 * 
 * 3. Implement two concrete classes that extend AbstractShape:
 *      Circle: Representing a Circle. Include a radius as an attribute.
 *      Rectangle: Representing a Rectang;le, include length and width as attributes.
 * 
 * 4. In the Main class:
 *      Create instances of Circle and Rectangle
 *      Display their Areas and perimeters
 */

interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

abstract class AbstractShape implements Shape {
    protected String color;
    protected double length;
    protected double width;

    public AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    // Default implementations (for rectangular shapes)
    @Override
    public double calculateArea() {
        return this.length * this.width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (this.length + this.width);
    }

    public void displayColor() {
        System.out.println("Color: " + this.color);
    }
}

// Circle class
class Circle extends AbstractShape {
    private double radius;

    public Circle(String color, double radius) {
        super(color, 0, 0); // Circle doesn't use length and width
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public void displayInfo() {
        System.out.println("\nShape: Circle");
        this.displayColor();
        System.out.println("Radius: " + this.radius);
        System.out.println("Area: " + this.calculateArea());
        System.out.println("Perimeter: " + this.calculatePerimeter());
    }
}

// Rectangle class
class Rectangle extends AbstractShape {
    public Rectangle(String color, double length, double width) {
        super(color, length, width);
    }

    public void displayInfo() {
        System.out.println("\nShape: Rectangle");
        this.displayColor();
        System.out.println("Length: " + this.length);
        System.out.println("Width: " + this.width);
        System.out.println("Area: " + this.calculateArea());
        System.out.println("Perimeter: " + this.calculatePerimeter());
    }
}

public class Task15 {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 4.5);
        Rectangle rectangle = new Rectangle("Blue", 5.0, 3.0);

        circle.displayInfo();
        rectangle.displayInfo();
    }
}