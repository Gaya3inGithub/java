package j3_ControlStructure;
import java.util.Scanner;
public class Mutiply_without_star_symbol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a : ");
		int a = scanner.nextInt();
		System.out.print("Enter b : ");
		int b = scanner.nextInt();
		int sum=0;
		for (int i=0;i<a;i++)
		{
			 sum =sum+b;
		}
		 System.out.println("Product of a and b is: "+sum);
		 scanner.close();
	}

}
