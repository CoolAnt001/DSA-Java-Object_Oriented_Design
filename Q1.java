package assignment2;
import java.util.Scanner;
class Car_ {
	protected int year;
	protected String model;
	
	public void setDetails(String model,int year) {
		this.model=model;
		this.year=year;		
	}
	public void displayDetails() {
		System.out.println("model:"+model+"\nyear:"+year);
	}

}

public class Q1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		
		//Car1
		Car_ c1=new Car_();
		System.out.print("Enter car model name:");
		String m1=sc.next();
		System.out.print("Enter year: ");
		int y1=sc.nextInt();		
		c1.model=m1;
		c1.year=y1;
		c1.displayDetails();

		
		System.out.println();
		//Car2
		Car_ c2=new Car_();
		System.out.print("Enter car model name:");
		String m2=sc.next();
		System.out.print("Enter year: ");
		int y2=sc.nextInt();	
		c2.setDetails(m2,y2);
		c2.displayDetails();
		
		System.out.println();
		if (c1.year>c2.year)
			System.out.println(c1.model+" is newer.");
        sc.close();
	}

}
