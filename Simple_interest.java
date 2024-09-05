package j2_variables_datatypes_operators;
import java.util.Scanner;
public class Simple_interest {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		System.out.print("Enter the value of p:");
		int p= i.nextInt();
		System.out.print("Enter the value of n:");
		int n=i.nextInt();
		System.out.print("Enter the value of r:");
		float r=i.nextFloat();
		double Si=p*n*r/100;
		System.out.print("Si = ");
		System.out.print(Si);
	 i.close();
	}

}
