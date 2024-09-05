package j6_Num_based_logical_pgm;

import java.util.Scanner;

public class Number_to_binary {

	public static void main(String[] args) {
		 Scanner scanner=new Scanner (System.in);
	        System.out.print("Enter a number: ");
	        int n=scanner.nextInt();
	        String b=" ";
	        while (n>0)
	        {
	            int r=n%2;
	            int q=n/2;
	            n=q;
	            b=r+b;
	        }
	        System.out.println("The binary of given number is: "+b);
scanner.close();


	}

}
