package j6_Num_based_logical_pgm;
import java.util.Scanner;
public class Fibonacci_series {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number: ");
        int n = scanner.nextInt(); 
        int a = -1, b = 1;
      for (int i = 1; i <= n; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }

        System.out.println();
        
        scanner.close();
	}

}
