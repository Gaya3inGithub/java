package j2_variables_datatypes_operators;
import java.util.Scanner;
public class Swapping_without_variable {
public static void main (String[]args)
{
	Scanner s = new Scanner (System.in);
	System.out.print("a= ");
	int a = s.nextInt();
	System.out.print("b= ");
	int b = s.nextInt();
	System.out.println("Before Swapping:");
	System.out.println("a="+a);
	System.out.println("b="+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("After Swapping:");
	System.out.println("a="+a);
	System.out.print("b="+b);
	s.close();
	
}
}
