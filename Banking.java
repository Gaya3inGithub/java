package j8_OOPS;
public class Banking
{
	    public double accountBalance;
	    public Banking(double initialBalance) 
	    {
	        accountBalance = initialBalance;
	    }
	    public double deposit(double amount) 
	    {
	        if (amount > 0) 
	        {
	            accountBalance += amount;
	        }
	        return accountBalance;
	    }
	    public double withdraw(double amount) 
	    {
	        if (amount > 0 && amount <= accountBalance) 
	        {
	            accountBalance -= amount;
	        }
	        return accountBalance;
	    }
}
