package J12;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Gayathri {

	public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	
	try
	{
	System.out.print("Enter a: ");
	int a = scanner.nextInt();
	System.out.print("Enter b: ");
	int b=scanner.nextInt();
	int c=a+b;
	System.out.println("a+b = " + c);
	}
	catch(InputMismatchException e)
	{
		System.out.println("Enter numbers only");
	}
	scanner.close();
	}

}
