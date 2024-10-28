package J12;
import java.util.Scanner;
import java.lang.ArithmeticException;
public class Array_Exception
{
public static void main (String[]args)
{
	try
	{
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter size of an array: ");
	int n = scanner.nextInt();
	int []a=new int[n];
	System.out.print("Enter element of an array: ");
	for(int i=0;i<a.length;i++)
	{
		a[i]=scanner.nextInt();
	}
	System.out.print("Enter position: ");
	int x = scanner.nextInt();
	System.out.print("Enter position: ");
	int y =scanner.nextInt();
	System.out.println("The value is: ");
	for(int j=1;j<2;j++)
	{
		System.out.println(a[x]);
		System.out.println(a[y]);
	}
	
    int z = a[x]/a[y];
    System.out.println(z);
    scanner.close();
	}
	catch(ArithmeticException e)
	{
		System.out.println("Denominator should not be zero");
	}
   
}

}
