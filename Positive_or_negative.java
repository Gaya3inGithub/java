package j3_ControlStructure;
import java.util.Scanner;
public class Positive_or_negative {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.print("Enter a number: ");
		int n = s.nextInt();
if(n>0)
	System.out.println("positive number");
else
	System.out.println("negative number");
s.close();
	}
	
}
