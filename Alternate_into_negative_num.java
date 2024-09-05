package j6_Num_based_logical_pgm;
import java.util.Scanner;
public class Alternate_into_negative_num {
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.print("Enter the size of an Array: ");
	int n=scanner.nextInt();
	int []a=new int[n];
	System.out.print("Enter the element of an Array: ");
	for(int i=0;i<a.length;i++)
	{
		a[i]=scanner.nextInt();
	}
	 for (int i = 1; i < a.length; i += 2) {
         a[i] = -a[i];
     }
     System.out.print("[");
     for (int i = 0; i < a.length; i++) {
         System.out.print(a[i]);
         if (i < a.length - 1) {
             System.out.print(", ");
         }
     }
     System.out.println("]");
scanner.close();
	}

}

