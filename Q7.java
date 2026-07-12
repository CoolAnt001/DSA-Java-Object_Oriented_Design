package assignment2;
class Shape1 {

    String color;

    // Constructor
    Shape1(String c) {
        color = c;
    }
}

class Circle1 extends Shape1 {

    double radius;

    // Constructor
    Circle1(String c, double r) {
        super(c);   // call Shape constructor
        radius = r;
    }

    // Method to calculate area
    double area() {
        return Math.PI * radius * radius;
    }

    // Display method
    void display() {
        System.out.println("Shape: Circle");
        System.out.println("Color: " + color);
        System.out.println("Area: " + area());
        System.out.println();
    }
}

class Rectangle1 extends Shape1 {

    double length, width;

    // Constructor
    Rectangle1(String c, double l, double w) {
        super(c);   // call Shape constructor
        length = l;
        width = w;
    }

    // Method to calculate area
    double area() {
        return length * width;
    }

    // Display method
    void display() {
        System.out.println("Shape: Rectangle");
        System.out.println("Color: " + color);
        System.out.println("Area: " + area());
        System.out.println();
    }
}

public class Q7 {
    public static void main(String[] args) {

        Circle1 c = new Circle1("Red", 10);
        Rectangle1 r = new Rectangle1("Blue", 3, 10);

        c.display();
        r.display();
    }
}
