package j9_Inheritance;

import java.util.Scanner;

public class Employee
{
	
	   public int empid;
	   public String n;
	   public int salary;
	   
	   public void empdata()
	   {
		   Scanner scanner = new Scanner(System.in);
			 System.out.print("Enter employee ID: ");
			empid = scanner.nextInt();
			scanner.nextLine();
			
			 System.out.print("Enter employee name: ");
		   	n= scanner.nextLine();
			
			 System.out.print("Enter employee salary: ");
			salary = scanner.nextInt();
			scanner.nextLine();
	   }
	   
	   public void empdisplay()
	   {
	       System.out.println("ID : "+ empid);
	       System.out.println("NAME : "+n);
	       System.out.println("SALARY : "+ salary);
	   }
	   
}

