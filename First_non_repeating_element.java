package j6_Num_based_logical_pgm;
import java.util.Scanner;
public class First_non_repeating_element {
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
		 boolean found = false; 
		for(int i=0;i<a.length;i++)
		{
			int c=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					c++;
					if(c==2)
					{
						break;
					}
				}
			}
			if(c==1)
			{
				System.out.println("The first non - repeated element is: "+a[i]);
				 found = true;
	                break;
			}
			
		}
		if (!found) {
            System.out.println("No non-repeating element found.");
        }

	scanner.close();
	}

}
