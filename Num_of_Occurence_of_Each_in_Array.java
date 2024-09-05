package j6_Num_based_logical_pgm;
import java.util.Scanner;
public class Num_of_Occurence_of_Each_in_Array {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the size of an Array: ");
		int n=scanner.nextInt();
		int []a=new int[n];
		int []b=new int[n];
		int c=0;
		System.out.print("Enter the element of an Array: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scanner.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			int count = 0;
			
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
			 b[c]=a[i];
			 c++;
			}
		}
		for(int i=0;i<c;i++)
		{
			int d=0;
			for(int j=0;j<a.length;j++)
			{
				if(b[i]==a[j])
				{
					d++;
				}
			}
			System.out.println(b[i]+" "+d);
		}
	scanner.close();
			
	}

}



