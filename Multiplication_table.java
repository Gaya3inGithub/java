package j3_ControlStructure;
import java.util.Scanner;
public class Multiplication_table {

	public static void main(String[] args) {
	 Scanner scanner=new Scanner (System.in);
	 System.out.print("Enter the value of n: ");
	 int n =scanner.nextInt(); 
	 for(int i=1;i<=10;i++)
	 {
		 System.out.println(n+" x "+i+" = "+i*n);
	 }
	 
	 
     scanner.close();	 
	}

}
