package assignment2;

import java.util.Scanner;

class Complex {
	private double real,imag;
	public void setData(double real,double imag) {
		this.real=real;
		this.imag=imag;
	}
	
	public void display() {
		System.out.println(this.real+" + "+this.imag+"i");
	}
	 public Complex add(Complex c1,Complex c2) {
		 Complex result=new Complex();
		 result.real=c1.real+c2.real;
		 result.imag=c1.imag+c2.imag;
		 return result;
	 }
}
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		Complex c1=new Complex();
		System.out.print("Enter real part of the first Complex number: ");
		double r1=sc.nextDouble();
		System.out.print("Enter imaginary part of the first Complex number: ");
		double i1=sc.nextDouble();
		c1.setData(r1, i1);
		c1.display();
		
		
		Complex c2=new Complex();
		System.out.print("Enter real part of the secondary Complex number: ");
		double r2=sc.nextDouble();
		System.out.print("Enter imaginary part of the secondary Complex number: ");
		double i2=sc.nextDouble();
		c2.setData(r2, i2);
		c2.display();
		
		Complex result=new Complex();
		result=result.add(c1, c2);
		System.out.print("After adding them: "); 
		result.display();
sc.close();
	}

}

