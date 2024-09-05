package j3_ControlStructure;
import java.util.Scanner;
public class odd_or_even {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.print("Enter a number: ");
		int n = s.nextInt();
if(n%2==0)
	System.out.println("Even number");
else
	System.out.println("odd number");
s.close();
	}
	
}
