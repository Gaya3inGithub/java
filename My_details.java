package j2_variables_datatypes_operators;
import java.util.Scanner;
public class My_details {

	public static void main(String[] args) {
		
		        Scanner scn = new Scanner(System.in);
		       
		        System.out.print("Enter your reg number:");
		        int regno=scn.nextInt();
		        scn.nextLine();
		       
		        System.out.print("Enter your name:");
		        String name=scn.nextLine();
		       
		        System.out.print("Gender:");
		        char gender=scn.next().charAt(0);
		        scn.nextLine();
		       
		        System.out.print("Your Qualification:");
		        String qualification=scn.nextLine();
		       
		        System.out.print("Year of passed:");
		        int yop=scn.nextInt();
		       
		        System.out.print("Enter your CGP:");
		        float cgp=scn.nextFloat();
		       
		        System.out.print("Are you placed? :");
		        boolean placed=scn.nextBoolean();
		       
		        System.out.print("Enter your mobile number:");
		        long mobile=scn.nextLong();
		       
		        System.out.println("Given values are:");
		        System.out.println(regno);
		        System.out.println(name);
		        System.out.println(gender);
		        System.out.println(qualification);
		        System.out.println(yop);
		        System.out.println(cgp);
		        System.out.println(placed);
		        System.out.println(mobile);
		        scn.close();
		    }
		
	}


