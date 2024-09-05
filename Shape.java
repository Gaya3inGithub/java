package j8_OOPS;
import java.util.Scanner;
public class Shape 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter radius: ");
		double radius = scanner.nextDouble();
		Circle r =new Circle();
		double A = r.circleArea(radius);
		double P = r.circlePerimeter(radius);
		System.out.println("Area of Circle is: "+A);
		System.out.print("Perimeter of Circle is: "+P);
		scanner.close();
				
	}

}
