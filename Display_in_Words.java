package j6_Num_based_logical_pgm;
import java.util.Scanner;
public class Display_in_Words {

	public static void main(String[] args) {
	Scanner scanner=new Scanner (System.in);
   System.out.print("Enter a number: ");
		        int n=scanner.nextInt();
		        String b=" ";
		        while (n>0)
		        {
		            int r=n%10;
		            int q=n/10;
		            n=q;
		           
		            switch (r)
		            {
		 case 0:b="zero "+b;
		                      break;
		 case 1:b="one "+b;
		                      break;
		 case 3:b="three "+b;
		                     break;
		case 4:b="four "+b;
		                     break;
		case 5:b="five "+b;
		                     break;
		case 6:b="six "+b;
		                     break;
		case 7:b="seven "+b;
		                     break;
		case 8:b="eight "+b;
		                     break;
		case 9:b="nine "+b;
		                     break;
		            }
		        }
		        System.out.println("The  given number is: "+b);
		        scanner.close();
		    }
	}


