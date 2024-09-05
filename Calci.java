package j8_OOPS;

import java.util.Scanner;

public class Calci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a=scanner.nextInt();
		System.out.print("Enter b: ");
		int b=scanner.nextInt();
		Calculator c =new Calculator();
		int plus = c.addition(a,b);
		System.out.println("Addition: "+plus);
		int minus = c.subraction(a,b);
		System.out.println("Subraction: "+minus);
		int multiply = c.multiplication(a,b);
		System.out.println("Multiplication: "+multiply);
		int divide = c.division(a,b);
		System.out.println("Division: "+divide);
		scanner.close();

	}

}
