package j2_variables_datatypes_operators;
import java.util.Scanner;
public class Swapping {
	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value of a:" );
		int a=s.nextInt();
		System.out.print("Enter the value of b:");
		int b=s.nextInt();
		s.nextLine();
		s.nextLine();
		System.out.println("Before Swapping:-");
		System.out.println("The value of a is:"+a);
		System.out.println("The value of b is:"+b);
		int c = a;
		a=b;
		b=c;
		s.nextLine();
		System.out.println("After Swapping:-");
		System.out.println("The value of a is:"+a);
		System.out.println("The value of b is:"+b);
		s.close();
	}
}


