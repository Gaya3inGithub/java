package j9_Inheritance;
import java.util.Scanner;
public class SavingsAccount extends BankAccount{
public int interestRate;
public void inputSavingsDetails() {
	
    Scanner scanner = new Scanner(System.in);
    
    inputAccountDetails();
    
    System.out.print("Enter interest rate (in %): ");
    interestRate =scanner.nextInt();
    
}

public void deposit(int amount )
{
	if(amount>0)
	{
		balance+=amount;
		System.out.println("Deposited: Rs."+amount);
	}
	else
	{
		System.out.println("Deposit amount should be in positive number");
	}
}

public void withdraw(int amount) 
{
	if(amount>0)
	{
		if(amount<=balance)
		{
			balance-=amount;
			System.out.println("Withdrawn: Rs."+amount);
		}
		else
		{
			System.out.println("Insufficient fund for withdrawl");
		}
	}
	else
	{
		System.out.println("Withdrawl amount must be positive");
	}
}

public void display() {
    super.display();
    System.out.println("Interest Rate: " + interestRate + "%");
}

}
