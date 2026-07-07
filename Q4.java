package assignment2;

class Deposit {

    long Principal;
    int Time;
    double Rate;
    double Total_amt;

    // Constructor 1 (Default)
    Deposit() {
        Principal = 0;
        Time = 0;
        Rate = 0;
    }

    // Constructor 2
    Deposit(long p, int t, double r) {
        Principal = p;
        Time = t;
        Rate = r;
    }

    // Constructor 3
    Deposit(long p, int t) {
        Principal = p;
        Time = t;
        Rate = 5.0;   // default rate
    }

    // Constructor 4
    Deposit(long p, double r) {
        Principal = p;
        Rate = r;
        Time = 1;    // default time
    }

    // Method to calculate total amount
    void calc_amt() {
        Total_amt = Principal + (Principal * Rate * Time) / 100;
    }

    // Method to display values
    void display() {
        System.out.println("Principal: " + Principal);
        System.out.println("Time: " + Time);
        System.out.println("Rate: " + Rate);
        System.out.println("Total Amount: " + Total_amt);
        System.out.println();
    }
}

public class Q4 {
    public static void main(String[] args) {

        Deposit d1 = new Deposit();
        Deposit d2 = new Deposit(10000, 2, 5.5);
        Deposit d3 = new Deposit(15000, 3);
        Deposit d4 = new Deposit(20000, 6.5);

        d1.calc_amt();
        d2.calc_amt();
        d3.calc_amt();
        d4.calc_amt();

        d1.display();
        d2.display();
        d3.display();
        d4.display();
    }
}