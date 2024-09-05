package j9_Inheritance;

import java.util.Scanner;

public class Engineer extends Employee
{
	 
	 public String specialization;
	 
	 public void engdata()
	 {
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter specialization: ");
		 specialization = scanner.nextLine();
	 }
	 
	 public void engdisplay()
	   {
	       System.out.println("specialization : "+specialization);
	   }
	 
	 public static void main(String[] args) 
	 {
		 Scanner scanner = new Scanner(System.in);


		 Engineer e = new Engineer();
		   e.empdata();
	       e.empdisplay();
	       System.out.println();
	       
	       e.engdata();
	       e.engdisplay();
	       System.out.println();
	        
	       Manager m = new Manager();
	       m.mngdata();
	       m.mngdisplay();
	    
	   scanner.close();   
	  }
}
