package assignment2;

interface Flyable {
    void fly();
}

interface Swimmable {
    void swim(); 
}

class Duck implements Flyable, Swimmable {

    String name;

    // Constructor
    Duck(String n) {
        name = n;
    }

    // Implement fly method
    public void fly() {
        System.out.println("Flying");
    }

    // Implement swim method
    public void swim() {
        System.out.println("Swimming");
    }

    // Display details
    void displayDetails() {
        System.out.println("Duck Name: " + name);
        System.out.println("Capabilities: Can Fly and Can Swim");
    }
}

public class Q8 {
    public static void main(String[] args) {

        Duck d = new Duck("Donald");

        d.fly();
        d.swim();
        d.displayDetails();
    }
}
