package J12;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Division_exception_handling {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		try
		{
			System.out.print("Enter a: ");
			int a = scanner.nextInt();
			System.out.print("Enter b: ");
			int b=scanner.nextInt();
			int c=a+b;
			System.out.println("a+b = "+c);
		try
		{
		int d =a/b;
		System.out.println("a/b = "+d);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Denominator should not be Zero");
		}
		}
	catch(InputMismatchException e)
	{
		System.out.println("Enter numbers only");
	}
	
		scanner.close();
	}

}
