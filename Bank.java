package j8_OOPS;
	public class Bank{
	    public double balance;
	    public Bank(double initialBalance) {
	        balance = (initialBalance >= 0) ? initialBalance : 0;
	        if (initialBalance < 0) {
	            System.out.println("Initial balance cannot be negative.");
	        }
	    }
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: Rs." + amount);
	        } else {
	            System.out.println("Deposit amount must be positive.");
	        }
	    }
	    public void withdraw(double amount) {
	        if (amount > 0) {
	            if (amount <= balance) {
	                balance -= amount;
	                System.out.println("Withdrawn: Rs." + amount);
	            } else {
	                System.out.println("Insufficient funds for withdrawal.");
	            }
	        } else {
	            System.out.println("Withdrawal amount must be positive.");
	        }
	    }
	    public void checkBalance() {
	        System.out.println("Current balance: Rs." + balance);
	    }
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	