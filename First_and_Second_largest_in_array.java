package j6_Num_based_logical_pgm;
import java.util.Scanner;
public class First_and_Second_largest_in_array {
	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the size of an Array: ");
		int n=scanner.nextInt();
		int []a=new int[n];
		System.out.print("Enter the element of an Array: ");
		for( int i=0;i<a.length;i++)
		{
			a[i]=scanner.nextInt();
		}
	   for(int i=0;i<a.length;i++)
	   {
		   for(int j=i+1;j<a.length;j++)
		   {
			   if(a[i]>a[j])
			   {
				   int temp=a[i];
				   a[i]=a[j];
				   a[j]=temp;
			   }
		   }
		   
	   }
	   System.out.println("Largest number is: "+a[a.length-1]);
	   System.out.println("Second Largest number is: "+a[a.length-2]);
		scanner.close();
		
	}

}