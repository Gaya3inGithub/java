package J12;

import java.util.Scanner;
import java.util.InputMismatchException;
public class Simple_interest_exception {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	try
	{
	System.out.print("Enter principle amount: ");
	int p= scanner.nextInt();
	System.out.print("Enter number of years: ");
	int n= scanner.nextInt();
	System.out.print("Enter rate of interest(in percentage): ");
	int r = scanner.nextInt();
	
	int SI = p*n*r/100;
	System.out.println("SI = "+SI);
	}
	catch(InputMismatchException e)
	{
		System.out.println("years should be in natural numbers");
	}
    scanner.close();
	}

}
