package j3_ControlStructure;
import java.util.Scanner;
public class Divisible_by_3_and_5_for_loop {
public static void main (String[]args)
{
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the number : ");
	int n = scanner.nextInt();
	for(int i=1;i<=n;i++)
	{
		if(i%3==0 && i%5==0)
		{
			System.out.println("Accord InfoMatrix");
		}
		else if(i%3==0)
		{
			System.out.println("accord");
		}
		else if(i%5==0)
		{
			System.out.println("infomatix");
		}
		else
			System.out.println(i);
	}
scanner.close();
}
}
