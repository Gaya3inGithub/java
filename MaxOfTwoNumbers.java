package j20_Collection;

import java.util.Scanner;

public class MaxOfTwoNumbers {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter first number: ");
	        int num1 = scanner.nextInt();
	        System.out.print("Enter second number: ");
	        int num2 = scanner.nextInt();

	        Maximum findMax = (a, b) -> (a > b) ? a : b;
	        System.out.println("The maximum is: " + findMax.getMax(num1, num2));
	        
	        scanner.close();
}
}

