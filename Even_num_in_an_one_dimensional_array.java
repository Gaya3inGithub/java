package j3_ControlStructure;
import java.util.Scanner;
public class Even_num_in_an_one_dimensional_array
{

	public static void main(String[] args)
	{
	Scanner scanner =new Scanner(System.in);
		System.out.print("Enter the size of an array: ");
		int size=scanner.nextInt();
		int []a=new int[size];
		int []b=new int[size];
		int k=0;
		for(int i=0;i<size;i++)
		{
			a[i]=scanner.nextInt();	
		}
		for(int j=0;j<size;j++)
		{
			if(a[j]%2==0)
			{
			b[k]=a[j];
		    k++;
			}
		}
	System.out.println("The even numbers in the given array is: ");
	for(int i=0;i<k;i++)
	{
		System.out.println(b[i]);
	}
	scanner.close();
	}
	
}


