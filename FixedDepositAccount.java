package j9_Inheritance;
import java.util.Scanner;
public class FixedDepositAccount extends BankAccount
{
	
public int maturityPeriod;

public void inputFixedDepositDetails()
{
	Scanner scanner=new Scanner(System.in);

	inputAccountDetails();

	System.out.print("Enter Maturity period (in months): ");
	maturityPeriod = scanner.nextInt();
	
}

public void display()
{
	super.display();
	System.out.println("Maturity Period: "+ maturityPeriod + " months");
}


public static void main(String[] args) 
{

Scanner scanner = new Scanner(System.in);

   System.out.println();
   System.out.println("---------------Create a Savings Account----------\n");
     
   SavingsAccount savingsAccount = new SavingsAccount();
     
   savingsAccount.inputSavingsDetails();
     
   System.out.print("Enter amount to deposit: ");
   savingsAccount.deposit(scanner.nextInt());
    
   System.out.print("Enter amount to withdraw: ");
   savingsAccount.withdraw(scanner.nextInt());
     
   System.out.println("\nSavings Account Details:");
   savingsAccount.display();

    
   System.out.println("\n-----------Create a Fixed Deposit Account-------");
   FixedDepositAccount fixedDepositAccount = new FixedDepositAccount();     fixedDepositAccount.inputFixedDepositDetails();
     
   System.out.println("\nFixed Deposit Account Details:");
   fixedDepositAccount.display();
scanner.close();
}

}
