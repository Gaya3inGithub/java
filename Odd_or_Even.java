package j2_variables_datatypes_operators;
import java.util.Scanner;
public class Odd_or_Even {
	public static void main(String[] args) {
	Scanner a = new Scanner (System.in);
	System.out.print("Enter the value of n:");
	int n = a.nextInt();
    int rem = n%2;
    String b = rem==0?"even":"odd";
    System.out.print(b);
    a.close();
	}

}








