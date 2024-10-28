package J12;
import java.util.Scanner;
public class String_to_integer_exception {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		try
		{
			System.out.print("Enter number: ");
			String s= scanner.nextLine();
			int n=Integer.parseInt(s);
			System.out.println("Number is: "+n);
		}
		catch (NumberFormatException e) 
		{
            System.out.println(" The input string is not a valid integer.");
        } 
		finally 
		{
            System.out.println(" Conversion attempt is complete.");
        }
		scanner.close();
		
		       
		}
}



