package j6_Num_based_logical_pgm;

import java.util.Scanner;

public class Hollow_rec_or_sq {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter n:");
		        int n=scanner.nextInt();
		        for(int i=1;i<=n;i++)
		        {
		            for(int j=1;j<=n;j++)
		            {
		            	if(i==1 || i==n || j==1 || j==n)
		            	{
		                System.out.print("* ");
		            	}
		            	else
		            	{
		            		 System.out.print("  ");
		            	}
		            }
		            System.out.println();
		        }
scanner.close();
	}

}
