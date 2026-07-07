package assignment2;
import java.util.Scanner;

class Bank{
    String bankName;
    double depositAmount;
    static double totalAmount = 0;

    void setBankName(String name){
        bankName = name;
    }

    void setAmount(double amount){
        if(amount >= 1000){
            depositAmount = amount;
            totalAmount += amount;
        }
        else{
            System.out.println("Minimum deposit is 1000. Setting amount to 1000.");
            depositAmount = 1000;
            totalAmount += 1000;
        }
    }

    void showData(){
        System.out.println("Bank Name: " + bankName);
        System.out.println("Deposit Amount: " + depositAmount);
    }
}

public class Q13{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Bank b[] = new Bank[5];

        for(int i=0;i<5;i++){
            b[i] = new Bank();

            System.out.print("Enter Bank Name: ");
            String name = sc.next();

            System.out.print("Enter Deposit Amount: ");
            double amt = sc.nextDouble();

            b[i].setBankName(name);
            b[i].setAmount(amt);
        }

        System.out.println("\n--- Bank Details ---");
        for(int i=0;i<5;i++){
            b[i].showData();
        }

        System.out.println("\nTotal Amount Deposited: " + Bank.totalAmount);

        double min = b[0].depositAmount;
        String minBank = b[0].bankName;

        for(int i=1;i<5;i++){
            if(b[i].depositAmount < min){
                min = b[i].depositAmount;
                minBank = b[i].bankName;
            } 
        }

        System.out.println("Bank with Minimum Deposit: " + minBank);
    }
}
