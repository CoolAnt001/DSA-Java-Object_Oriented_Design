package assignment2;
import java.util.Scanner;

class Student{
    int Roll;
    String Name;
    int DSA_Mark;

    void getdata(Scanner sc){
        System.out.print("Enter Roll: ");
        Roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        Name = sc.nextLine();

        System.out.print("Enter DSA Marks: ");
        DSA_Mark = sc.nextInt();
    }

    void showdata(){
        System.out.println("Roll: " + Roll);
        System.out.println("Name: " + Name);
        System.out.println("DSA Marks: " + DSA_Mark);
    }
}

public class LinearSearchMaxMarks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students");
        int n=sc.nextInt();
        Student s[] = new Student[n];

        for(int i=0;i<n;i++){
            s[i] = new Student();
            s[i].getdata(sc);
        }

        int max = s[0].DSA_Mark;
        int index = 0;

        for(int i=1;i<n;i++){
            if(s[i].DSA_Mark > max){
                max = s[i].DSA_Mark;
                index = i;
            }
        }
 
        System.out.println("\nStudent with Highest DSA Marks:");
        s[index].showdata();
    }
}
