package J12;
import java.util.Scanner;
public class BankTransaction{

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount(1000.00); 
        try {
        	System.out.print("Enter amout to withdraw1: ");
        	int w1 = scanner.nextInt();
            System.out.println("Attempting to withdraw Rs."+w1+"....");
            account.withdraw(w1);
            System.out.print("Enter amout to withdraw2: ");
        	int w2 = scanner.nextInt();
            System.out.println("Attempting to withdraw Rs."+w2+"....");
            account.withdraw(w2);  
            } 
        
        catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } 
        finally {
            System.out.println("Transaction attempt complete.");
        }
        scanner.close();
    }
}


