package j9_Inheritance;

import java.util.Scanner;

public class Manager extends Employee
{
	 public String dept;
	 
	 public void mngdata()
	 {
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter employee dept: ");
		   	dept = scanner.nextLine();
		 scanner.close();
	 }
	 
	 public void mngdisplay()
	   {   
	       System.out.println("DEPARTMENT : "+ dept);
	   }
}
