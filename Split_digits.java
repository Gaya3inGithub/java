package j3_ControlStructure;
import java.util.Scanner;
public class Split_digits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = scanner.nextInt();
		while(n>0)
		{
			int r = n%10;
			int q = n/10;
			n=q;
			System.out.println(r);
			
		}
		scanner.close();

	}

}
