package j2_variables_datatypes_operators;
import java.util.Scanner;
public class Area_of_circle {

	public static void main(String[] args) {
		Scanner Area = new Scanner(System.in);
		System.out.print("Enter the value for r:");
		int r=Area.nextInt();
		double ar = 3.14*r*r;
		System.out.print("Area of the Circle is ");
		System.out.print(ar);
		Area.close();
	   
	}

}
