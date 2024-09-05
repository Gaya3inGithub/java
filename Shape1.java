package j8_OOPS;
import java.util.Scanner;
public class Shape1
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter radius: ");
		double r = scanner.nextDouble();
		Cir c = new Cir(r);
		double A = c.circleArea();
		double P = c.circlePerimeter();
		System.out.println("Area of Circle is: "+A);
		System.out.print("Perimeter of Circle is: "+P);
		scanner.close();
				
	}

}
