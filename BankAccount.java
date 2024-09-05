package j9_Inheritance;
import java.util.Scanner;
public class BankAccount {
public String accountNumber;
public String accountHolderName;
public int balance;
public void inputAccountDetails()
{
	Scanner scanner = new Scanner(System.in);
	
    System.out.print("Enter account number: ");
    accountNumber = scanner.nextLine();
    
    System.out.print("Enter account holder's name: ");
    accountHolderName = scanner.nextLine();
    
    System.out.print("Enter initial balance: ");
    balance = scanner.nextInt();
    scanner.nextLine(); 
  
}

public void display()
{
	System.out.println("Account Number: "+accountNumber);
	System.out.println("Account Holder: "+accountHolderName);
	System.out.println("Balance: Rs."+balance);
}
}
