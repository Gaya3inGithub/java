package j6_Num_based_logical_pgm;
import java.util.Scanner;
public class Series_nth_term {
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.print("Enter a number: ");
	int n=scanner.nextInt();
	  if (n <= 0) {
          System.out.println("Please enter a positive integer.");
      }
	  for (int i = 1; i <= n; i++)
	  { int term = (i * (i + 1)) / 2;
      System.out.print(term + " ");
  }
  System.out.println(); 
      int nthTerm = (n * (n + 1)) / 2;
      System.out.println("The " + n + "th term of the number series is: " + nthTerm);
      scanner.close();
	}
}

