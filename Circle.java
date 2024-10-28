package Abstraction;

public class Circle extends Shape{
public double radius;
	public Circle(double r) 
	{
		radius=r;
	}

@Override
public double calculateArea()
{
	 radius = 3.14*radius*radius;
	 return radius;
}

@Override
public void displayShapeName() 
{
  System.out.println("Shape Name: Circle");   
}
}
