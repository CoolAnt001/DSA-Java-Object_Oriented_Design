package assignment2;

class Distance{
    int feet;
    int inches;

    Distance(int feet, int inches){
        this.feet = feet;
        this.inches = inches;
    }

    void displayDistance(){
        System.out.println("Distance: " + feet + "' " + inches + "\"");
    }
}

class Measurement extends Distance{
    double centimetres;

    Measurement(int feet, int inches){
        super(feet, inches);
        centimetres = (feet * 12 + inches) * 2.54;
    }

    void displayMeasurement(){
        super.displayDistance();
        System.out.println("Distance in Centimetres: " + centimetres);
    }
}

public class Q14{
    public static void main(String[] args){
        Measurement m = new Measurement(5, 10);

        m.displayMeasurement();
    }
}