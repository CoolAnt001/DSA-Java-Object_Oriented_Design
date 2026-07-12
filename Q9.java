package assignment2;

class Employee {

    String name;
    double salary;

    // Constructor
    Employee(String n, double s) {
        name = n;  
        salary = s; 
    } 
 
    // Method to display employee info
    void displayEmployeeInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
} 
 
class Manager extends Employee {
 
    String department;

    // Constructor
    Manager(String n, double s, String d) {
        super(n, s);   // calling Employee constructor
        department = d;
    } 
 
   // Method to display manager details
    void displayManagerDetails() {
        super.displayEmployeeInfo();  // calling parent method
        System.out.println("Department: " + department);
    }
}

public class Q9 {
    public static void main(String[] args) {

        Manager m = new Manager("Aditya", 110000, "HR");

        m.displayManagerDetails();
    }
}
