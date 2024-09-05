package j5_String;

import java.util.Scanner;

public class UserName_and_Password {
	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a username:");
	        String username = scanner.nextLine();
	        System.out.print("Enter a password:");
	       String password = scanner.nextLine();
	       if(username.equals("ABCD") && password.equals("1234"))
	       {
	    	   System.out.println("Succesfully completed!!!");
	       }
	       else
	       {
	    	   System.out.println("Failed!!!");
	       }
	        scanner.close();
	}

}
