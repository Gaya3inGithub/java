package j2_variables_datatypes_operators;
import java.util.Scanner;
public class Leap_year {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("Enter the year:");
	int y = s.nextInt();
	String a=y%4==0 && y%100!=0 || y%400==0?"leap year ": "Not leap year";
	System.out.print(a);
	s.close();
		

	}

}
