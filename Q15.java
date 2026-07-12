package assignment2;

class PointType{
    

    void printPoint(){
        System.out.println("Center Point: (" + x + ", " + y + ")");
    }

    int getX(){
        return x;
    }

    int getY(){
        return y;
    }
}

class CircleType extends PointType{
    double radius;

    void setRadius(double r){
        radius = r;
    }

    void printRadius(){
        System.out.println("Radius: " + radius);
    }

    void area(){
        double a = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + a);
    }

    void circumference(){
        double c = 2 * Math.PI * radius;
        System.out.println("Circumference of Circle: " + c);
    }
}

public class Q15{
    public static void main(String[] args){
    	    CircleType c = new CircleType();

        c.setPoint(3,4);
        c.setRadius(5);

        c.printPoint();
        c.printRadius();

        c.area();
        c.circumference();
    }
}
