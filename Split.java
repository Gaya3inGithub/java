package j5_String;

import java.util.Scanner;

public class Split {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string :");
        String Str = scanner.nextLine();
        int n=Str.length();		 
        String [] a =Str.split(" ");
		 for (int i = 0; i < a.length; i++)
		 {
			 System.out.println(a[i]);
		 }
        
		 scanner.close();
	}
}