package j8_OOPS;
import java.util.Scanner;
public class Account {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter initial balance: Rs.");
        double initialBalance = scanner.nextDouble();
        Banking myAccount = new Banking(initialBalance);
        System.out.println("Initial Balance: Rs." + myAccount.accountBalance);
        System.out.print("Enter amount to deposit: Rs.");
        double depositAmount = scanner.nextDouble();
        myAccount.deposit(depositAmount);
        System.out.println("New Balance after deposit: Rs." + myAccount.accountBalance);
        System.out.print("Enter amount to withdraw: Rs.");
        double withdrawAmount = scanner.nextDouble();
        myAccount.withdraw(withdrawAmount);
        System.out.println("New Balance after withdrawal: Rs." + myAccount.accountBalance);
        scanner.close();
	}

}
