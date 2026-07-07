package assignment2;
import studentpackage.Test;
import sportspackage.Sports;

//Q10
class Result extends Test implements Sports{
	public void grandTotal() {
		double totalMarks=mark1+mark2;
		double totalScore=score1+score2;
		System.out.println("Total Marks: "+totalMarks);
		System.out.println("Total Score: "+totalScore);
	}
}
public class Q10{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result r=new Result();
		r.inputDetails();
		r.showDetails();
		r.grandTotal();
	}

}
