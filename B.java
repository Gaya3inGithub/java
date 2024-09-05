package j8_OOPS;
import java.util.Scanner;
public class B {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter initial balance: Rs.");
	        double initialBalance = scanner.nextDouble();
	        Bank account = new Bank(initialBalance);
	        boolean continueBanking = true;
	        while (continueBanking) {
	            System.out.println("\nMenu:");
	            System.out.println("1. Deposit");
	            System.out.println("2. Withdraw");
	            System.out.println("3. Check Balance");
	            System.out.println("4. Exit");
	            System.out.print("Choose an option: ");
	            int option = scanner.nextInt();
	            switch (option) {
	                case 1:
	                    System.out.print("Enter deposit amount: Rs.");
	                    double depositAmount = scanner.nextDouble();
	                    account.deposit(depositAmount);
	                    break;
	                case 2:
	                    System.out.print("Enter withdrawal amount: Rs.");
	                    double withdrawAmount = scanner.nextDouble();
	                    account.withdraw(withdrawAmount);
	                    break;
	                case 3:
	                    account.checkBalance();
	                    break;
	                case 4:
	                    continueBanking = false;
	                    break;
	                default:
	                    System.out.println("Invalid option. Please choose again.");
	            }
	        }

	        scanner.close();
	    }
	}

