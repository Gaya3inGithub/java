package j6_Num_based_logical_pgm;

import java.util.Scanner;

public class Flody_triangle_pattern {

	public static void main(String[] args) {
	 
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter n:");
		        int n=scanner.nextInt();
		        int k=1;
		        for(int i=1;i<=n;i++)
		        {
		            for(int j=1;j<=i;j++)
		            {
		            	System.out.print(k+" ");
		            	k++;
		            }
		            System.out.println();
		        }
scanner.close();
	}

}
