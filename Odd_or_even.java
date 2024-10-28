package j20_Collection;
import java.util.Scanner;
public class Odd_or_even {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter number: ");
	int n=scanner.nextInt();
	NumberCheck isoddeven = (num)->{
		return n%2==0?" Even":" Odd";
	};
	
System.out.println(n+" is"+isoddeven.check(n)+" number");
scanner.close();
	}
}

