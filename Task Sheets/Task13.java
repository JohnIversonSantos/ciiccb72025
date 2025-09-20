/*
 * 1. CREATE A BASE CLASS CALLED VEHICLE WITH THE FOLLOWING
 * ATTRIBUTES
 * make (String): The make of the vehicles
 * model (String): The model of the vehicles
 * year (int): The manufacturing year of the vehicle
 * 2. CREATE A DERIVED CLASS CALLED CAR THAT EXTENDS THE VEHICLE
 * CLASS. THE CAR CLASS SHOULD HAVE AN ADDITIONAL ATTRIBUTE:
 * numberOfDoors(int): The number of doors in the car
 * 3. CREATE AN INSTANCE OF THE CAR CLASS AND SET VALUES FOR ITS ATTRIBUTES.
 * 4. IMPLEMENT A METHOD IN THE CAR CLASS displayDetails() THAT PRINTS
 * OUT THE DETAILS OF THE CAR, INCLUDING THE INHERITED ATTRIBUTES
 * FROM THE VEHICLE CLASS
 * 
 * SAMPLE OUTPUT
 * 
 * Car Details:
 * Make: Toyota
 * Model: Camry
 * Year: 2022
 * Number of Doors: 4
 * 
 */

class Vehicle {
    String make;
    String model;
    int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}

class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + this.make);
        System.out.println("Model: " + this.model);
        System.out.println("Year: " + this.year);
        System.out.println("Number of Doors: " + this.numberOfDoors);
    }
}

public class Task13 {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 2022, 4);
        myCar.displayDetails();
    }
}

