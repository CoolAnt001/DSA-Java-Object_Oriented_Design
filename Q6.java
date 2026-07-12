package assignment2;

class Vehicle {

    String model;
    int year;

    // Base class constructor
    Vehicle(String m, int y) {
        model = m;
        year = y;
    }
}

class Car extends Vehicle {

    int carId;
    double price;

    // Derived class constructor
    Car(String m, int y, int id, double p) {
        super(m, y);   // calls Vehicle constructor
        carId = id;
        price = p;
    }

    // Method to display details
    void carDisplay() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Car ID: " + carId);
        System.out.println("Price: " + price);
    }
}

public class Q6 {
    public static void main(String[] args) {

        Car c = new Car("Toyota", 2026, 100201, 2699999);

        c.carDisplay();
    }
}
