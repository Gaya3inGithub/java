package j6_Num_based_logical_pgm;
import java.util.Scanner;
public class Zero_one_pattern {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter n:");
		        int n=scanner.nextInt();
		        for(int i=1;i<=n;i++)
		        {
		            for(int j=1;j<=i;j++)
		            {
		                System.out.print((j%2)+" ");
		            }
		            System.out.println();
		        }
scanner.close();
	}

}
