package assignment2;

class Book{
	int bookId;
	double price;
	int quantity;
    static double totalAmount;
    Book(int bookId,double price,int quantity) {
    	    this.bookId=bookId;
    	    this.price=price;
    	    this.quantity=quantity;
    	    totalAmount+=totalCost(price,quantity);
    } 
    public double totalCost(double price,int quantity) {
    	    return price*quantity;
    }
    public void displayDetails() {
    	    System.out.println("Book ID:"+this.bookId+"\nPrice:"+this.price+"\nQuantity"+this.quantity);
    	    
    } 
	
}
public class Q3 {
    public static void main(String[] args) {

        Book b1 = new Book(101, 500, 3);
        Book b2 = new Book(102, 900, 1);
        Book b3 = new Book(103, 450, 4);
        Book b4 = new Book(104, 250, 2);
        Book b5 = new Book(105, 150, 7);

        b1.displayDetails();
        b2.displayDetails();
        b3.displayDetails();
        b4.displayDetails();
        b5.displayDetails();

        System.out.println("Total Amount Spent on All Books: " + Book.totalAmount);
    }
}
