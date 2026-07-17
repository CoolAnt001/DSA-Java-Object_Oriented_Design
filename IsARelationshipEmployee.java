package assignment2;
class Person{
    String name;
    int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
} 
class Employee extends Person{
    int Eid;
    double salary;
    Employee(String name, int age, int Eid, double salary){
        super(name, age);
        this.Eid = Eid; 
        this.salary = salary;
    }
    void empDisplay(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + Eid);
        System.out.println("Salary: " + salary);
    }
}
public class IsARelationship_Employee{
    public static void main(String[] args){
        Employee e = new Employee("CoolAnt", 24, 26127480, 78000);
        e.empDisplay();
    }
}
