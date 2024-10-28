package J12;

public class BankAccount {
    private double balance;
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Withdrawal amount exceeds the current balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
            System.out.println("Remaining balance: $" + balance);
        }
    }
    public double getBalance() {
        return balance;
    }
}