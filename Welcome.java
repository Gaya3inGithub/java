package j8_OOPS;
import java.util.Scanner;
public class Welcome {
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.print("Enter name: ");
	String n = scanner.nextLine();
	Wel w1 = new Wel();
	Wel w2 = new Wel(n);
		scanner.close();	
	}

}
