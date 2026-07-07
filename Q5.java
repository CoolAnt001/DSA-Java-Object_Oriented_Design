package assignment2;

abstract class Shape {

    // abstract method
    abstract double area();
}

// Square class 
class Square extends Shape {
    double side;

    Square(double s) {
        side = s;
    }

    double area() {
        return side * side;
    }
}

// Triangle class
class Triangle extends Shape {
    double base, height;

    Triangle(double b, double h) {
        base = b;
        height = h;
    }

    double area() {
        return 0.5 * base * height;
    }
}

// Circle class
class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }
    double area() {
        return Math.PI * radius * radius;
    }
}

public class Q5 {
    public static void main(String[] args) {

        Square s = new Square(4);
        Triangle t = new Triangle(5, 3);
        Circle c = new Circle(2.5);
        
        System.out.println("Area of Square: " + s.area());
        System.out.println("Area of Triangle: " + t.area());
        System.out.println("Area of Circle: " + c.area());
    }
}