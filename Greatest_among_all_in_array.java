package j3_ControlStructure;
import java.util.Scanner;
public class Greatest_among_all_in_array {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of an array: ");
		int size=scanner.nextInt();
		int[]a=new int[size];
		int max=a[0];
		for(int i=0;i<size;i++)
		{
			a[i]= scanner.nextInt();
      	if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("The greatest number in the array is: "+max);
		scanner.close();

	}

}
