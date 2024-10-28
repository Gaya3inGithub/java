package J12;

import java.util.Scanner;
import  java.lang.ArithmeticException;
public class Divide_Exception {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try 
		{
		System.out.print("Enter x : ");
		int x = scanner.nextInt();
		System.out.print("Enter y: ");
		int y =scanner.nextInt();
		int z =x/y;
		System.out.println(z);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Denominator should not be zero");
		}
scanner.close();
	}

}
