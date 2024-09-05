package j8_OOPS;

public class Cir {
	public double radius;
	public Cir(double r)
	{
	 radius = r;
	}
	public double circleArea()
		{
		double Area = 3.14*radius*radius;
		return Area;
		}
	public double circlePerimeter() 
		{
		double Perimeter =2 * 3.14 * radius;
		return Perimeter;
		}
}
