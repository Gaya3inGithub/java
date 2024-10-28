package Abstraction;
import java.util.Scanner;
public class Rectangle extends Shape {
public int length,width;

public Rectangle(int l, int w)
{
    length = l;
    width = w;
}

@Override
public double calculateArea()
	{
		double a = length*width;
		return a;
	}
	
@Override
public void displayShapeName() {
    System.out.println("Shape Name: Rectangle");
}
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter Radius: ");
	double radius = scanner.nextInt();
		
	Circle c = new Circle(radius);
		
	c.displayShapeName();
	System.out.println("Area of Circle is: "+c.calculateArea());
	
	System.out.println();
	System.out.println("-----------------------------------------------------------");
	System.out.println();
	System.out.print("Enter length: ");
	int length = scanner.nextInt();
	
	System.out.print("Enter width: ");
	int width = scanner.nextInt();
	
	Rectangle r = new Rectangle(length, width);
	
	r.displayShapeName();
	System.out.println("Area of Rectangle is: "+r.calculateArea());
	scanner.close();
	}

}
