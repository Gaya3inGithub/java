package J12;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try
    {
    System.out.print("Enter age: ");
    int age = scanner.nextInt();
    if(age>=18)
    {
    	System.out.println(" Eligible to vote");
    }
    else
    {
    	System.out.println(" not eligible to vote");
    }
    }
    catch(InputMismatchException e)
    {
    	System.out.println(" Not a valid number \n enter numbers only ");
    }
    finally
    {
    	System.out.println(" Eligibility checked");
    }
    scanner.close();

	}

}
